package com.constat.pfe.controller;

import java.util.Optional;

import javax.swing.event.MouseInputListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.constat.pfe.entities.Assure;
import com.constat.pfe.entities.Utilisateur;
import com.constat.pfe.repository.UtilisateurRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {

	@Autowired
	private UtilisateurRepository utilisateurRepository ; 
	
	@PostMapping("/enregistrer")
	public Utilisateur ajouterUtilisateur(@RequestBody Utilisateur utilisateur) {
		System.out.println(utilisateur);
		return utilisateurRepository.save(utilisateur) ; 
	}
	
	@PostMapping("/authentification")	
	public long authentification( @RequestBody Utilisateur utilisateur) {
	
		Optional<Utilisateur> password = utilisateurRepository.findBymotDepaasse(utilisateur.getMotDepaasse()) ; 
		Optional<Utilisateur> userName = utilisateurRepository.findBynomUtilisateur(utilisateur.getNomUtilisateur()) ;
	
		Utilisateur user = new Utilisateur() ;
		if(password.isPresent() && userName.isPresent()) {
			user.setNomUtilisateur(userName.get().getNomUtilisateur());
			user.setMotDepaasse(password.get().getMotDepaasse());
			user.setId(userName.get().getId());
			System.out.println(user);
			return user.getId() ;	
		}else {
			return 0 ; 
		}
		
	}
	
	

	
	
	
}
