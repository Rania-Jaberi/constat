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


import com.constat.pfe.entities.Demande;
import com.constat.pfe.repository.DemandeRepository;


@CrossOrigin("*")

@RestController
@RequestMapping("/demande")
public class DemandeController {
	@Autowired
	private DemandeRepository demandeRepository;
	
	@GetMapping("/demandes")
	public List<Demande> getAllDemandes() {
		return demandeRepository.findAll();
	}
	
	@GetMapping("/demande/{id}")
	public Demande getDemande(@PathVariable("id") Long id) {

		return demandeRepository.findById(id).get();

	}
	

	@PostMapping("/enregistrer")
	public Demande addDemande(@RequestBody Demande demande) {

		return demandeRepository.save(demande);
	}
	
	@DeleteMapping("/supprimer/{id}")
	public void deleteDemande(@PathVariable("id") Long id) {
		demandeRepository.deleteById(id);
	}


	
	@PutMapping("/modifier/{id}")
	public Demande editDemande(@PathVariable("id") long id, @RequestBody Demande demande) {
		Optional<Demande> demandeById = demandeRepository.findById(id);
		if (demandeById.isPresent()) {
			Demande demandeUpdate = demandeById.get();
			//Demande demandeToUpdate = new Demande() ; 
			//demandeUpdate.setDateDeCreation(demande.getDateDeCreation());
			//demandeUpdate.setNomAssure(demande.getNomAssure());
			//demandeUpdate.setTelephone(demande.getTelephone());
			//demandeUpdate.setAdresse(demande.getAdresse());
			demandeRepository.save(demandeUpdate);
			return demandeUpdate;
		} else {
			return null;
		}
	}
	
}