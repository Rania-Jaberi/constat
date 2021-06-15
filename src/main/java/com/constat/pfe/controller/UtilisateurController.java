package com.constat.pfe.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.constat.pfe.entities.Assure;
import com.constat.pfe.entities.Utilisateur;
import com.constat.pfe.repository.AssureRepository;
import com.constat.pfe.repository.UtilisateurRepository;
import com.constat.pfe.service.UtilisateurImpl;
import com.constat.pfe.service.UtilisateurService;

@CrossOrigin("*")
@RestController
@RequestMapping("/uti")
public class UtilisateurController {

	@Autowired 
	private UtilisateurRepository utilisateurRepository;
	
	@Autowired
	private AssureRepository exportExpertRepository;
	@Autowired
	UtilisateurImpl utilisateurImpl;


	@PostMapping("/enregistrer")
	public Utilisateur ajouterUtilisateur(@RequestBody Assure utilisateur) {
		System.out.println("I m in controller" + utilisateur);
		return utilisateurImpl.enregistrerVoitureVersUtilisateur(utilisateur);
	}
	@GetMapping("/list")
	public List<Utilisateur> listUtilisateur() {
		System.out.println("I m in controller" );
		return utilisateurRepository.findAll();
	}
	@GetMapping("/lists")
	public List<Assure> listAssure() {
		System.out.println("I m in controller"+ exportExpertRepository.findAll() );
		List<Assure> assures  = exportExpertRepository.findAll();
		System.out.println("I m in controller"+assures );
		return exportExpertRepository.findAll();
	}
	@PostMapping("/authentification")
	public Utilisateur authentification(@RequestBody Utilisateur utilisateur) {

		Optional<Utilisateur> password = utilisateurRepository.findBymotDePasse(utilisateur.getMotDePasse());
		Optional<Utilisateur> userName = utilisateurRepository.findBynomUtilisateur(utilisateur.getNomUtilisateur());

		Utilisateur user = new Utilisateur();
		if (password.isPresent() && userName.isPresent()) {
			user.setNomUtilisateur(userName.get().getNomUtilisateur());
			user.setMotDePasse(password.get().getMotDePasse());
			user.setId(userName.get().getId());
			user.setProfession(userName.get().getProfession());
			System.out.println(user);
			return user;
		} else {
			return user;
		}

	}

}
