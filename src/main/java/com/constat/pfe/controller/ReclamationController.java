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


import com.constat.pfe.entities.Reclamation;
import com.constat.pfe.repository.ReclamationRepository;




@CrossOrigin("*")

@RestController
@RequestMapping("/reclamation")
public class ReclamationController {
	@Autowired
	private ReclamationRepository reclamationRepository;
	
	@GetMapping("/reclamations")
	public List<Reclamation> getAllReclamations() {
		return reclamationRepository.findAll();
	}
	
	@GetMapping("/reclamation/{id}")
	public Reclamation getReclamation(@PathVariable("id") Long id) {

		return reclamationRepository.findById(id).get();

	}
	
	@PostMapping("/enregistrer")
	public Reclamation addReclamation(@RequestBody Reclamation reclamation) {

		return reclamationRepository.save(reclamation);
	}
	
	@DeleteMapping("/supprimer/{id}")
	public void deleteReclamation(@PathVariable("id") Long id) {
		reclamationRepository.deleteById(id);
	}
	
	@PutMapping("/modifier/{id}")
	public Reclamation editReclamation(@PathVariable("id") long id, @RequestBody Reclamation reclamation) {
		Optional<Reclamation> reclamationById = reclamationRepository.findById(id);
		if (reclamationById.isPresent()) {
			Reclamation reclamationUpdate = reclamationById.get();
//			Assure reclamationToUpdate = new Assure() ; 
			reclamationUpdate.setObjet(reclamation.getObjet());
			//reclamationUpdate.setMotDePasse(reclamation.getMotDePasse());
			//reclamationUpdate.setTelephone(reclamation.getTelephone());
			//reclamationUpdate.setAdresse(reclamation.getAdresse());
			reclamationRepository.save(reclamationUpdate);
			return reclamationUpdate;
		} else {
			return null;
		}
	}
}