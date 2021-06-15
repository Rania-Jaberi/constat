package com.constat.pfe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.constat.pfe.entities.Compte;
import com.constat.pfe.repository.CompteRepository;



@CrossOrigin("*")

@RestController
@RequestMapping("/compte")
public class CompteController {
	@Autowired
	private CompteRepository compteRepository;
	
	
	@GetMapping("/comptes")
	public List<Compte> getAllComptes() {
		return compteRepository.findAll();
	}
	
	@GetMapping("/compte/{id}")
	public Compte getCompte(@PathVariable("id") Long id) {

		return compteRepository.findById(id).get();

	}
	
	
	@DeleteMapping("/supprimer/{id}")
	public void deleteCompte(@PathVariable("id") Long id) {
		compteRepository.deleteById(id);
	}
	@PostMapping("/enregistrer")
	public Compte addCompte(@RequestBody Compte compte) {

		return compteRepository.save(compte);
	}


	@PutMapping("/modifier/{id}")
	public Compte editCompte(@PathVariable("id") long id, @RequestBody Compte compte) {
		Optional<Compte> compteById = compteRepository.findById(id);
		if (compteById.isPresent()) {
			Compte compteUpdate = compteById.get();
//			Assure assureToUpdate = new Assure() ; 
			compteUpdate.setNomUtilisateur(compte.getNomUtilisateur());
			compteUpdate.setDateDeCreation(compte.getDateDeCreation());
			
			compteRepository.save(compteUpdate);
			return compteUpdate;
		} else {
			return null;
		}
	}
}