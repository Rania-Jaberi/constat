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

import com.constat.pfe.entities.Assure;
import com.constat.pfe.entities.Indemnisation;
import com.constat.pfe.repository.IndemnisationRepository;


@CrossOrigin("*")

@RestController
@RequestMapping("/indemnisation")
public class IndemnisationController {
	@Autowired
	private IndemnisationRepository indemnisationRepository;
	
	@GetMapping("/indemnisations")
	public List<Indemnisation> getAllIndemnisations() {
		return indemnisationRepository.findAll();
	}
	
	@GetMapping("/indemnisation/{id}")
	public Indemnisation getIndemnisation(@PathVariable("id") Long id) {
		try {
			return indemnisationRepository.findById(id).get();
		} catch (Exception e) {

		}
		return null;
	}
	
	@PostMapping("/enregistrer")
	public Indemnisation addIndemnisation(@RequestBody Indemnisation indemnisation) {

		return indemnisationRepository.save(indemnisation);
	}
	
	
	@PutMapping("/modifier/{id}")
	public Indemnisation editIndemnisation(@PathVariable("id") long id, @RequestBody Indemnisation indemnisation) {
		Optional<Indemnisation> indemnisationById = indemnisationRepository.findById(id);
		if (indemnisationById.isPresent()) {
			Indemnisation indemnisationUpdate = indemnisationById.get();
//			Indemnisation indemnisationToUpdate = new Indemnisation() ; 
		//	indemnisationUpdate.set(indemnisation.get());
			
			indemnisationRepository.save(indemnisationUpdate);
			return indemnisationUpdate;
		} else {
			return null;
		}
	}
	
	@DeleteMapping("/supprimer/{id}")
	public void deleteIndemnisation(@PathVariable("id") Long id) {
		indemnisationRepository.deleteById(id);
	}

	
	
}