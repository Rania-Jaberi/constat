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

import com.constat.pfe.entities.Assurance;
import com.constat.pfe.repository.AssuranceRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/assurance")
public class AssuranceController {
	@Autowired
	private AssuranceRepository assuranceRepository;

	@GetMapping("/assurances")
	public List<Assurance> getAllAssurances() {
		return assuranceRepository.findAll();
	}

	@GetMapping("/assurance/{id}")
	public Assurance getAssurance(@PathVariable("id") Long id) {

		return assuranceRepository.findById(id).get();

	}

	@PostMapping("/enregistrer")
	public Assurance addAssurance(@RequestBody Assurance assurance) {

		return assuranceRepository.save(assurance);
	}

	@DeleteMapping("/supprimer/{id}")
	public void deleteAssurance(@PathVariable("id") Long id) {
		assuranceRepository.deleteById(id);
	}

	@PutMapping("/modifier/{id}")
	public Assurance editAssurance(@PathVariable("id") long id, @RequestBody Assurance assurance) {
		Optional<Assurance> assuranceById = assuranceRepository.findById(id);
		if (assuranceById.isPresent()) {
			Assurance assuranceUpdate = assuranceById.get();
//			Assure assureToUpdate = new Assure() ; 
			assuranceUpdate.setNomAssurance(assurance.getNomAssurance());
			// assureUpdate.setMotDePasse(assure.getMotDePasse());
			// assureUpdate.setTelephone(assure.getTelephone());
			// assureUpdate.setAdresse(assure.getAdresse());
			assuranceRepository.save(assuranceUpdate);
			return assuranceUpdate;
		} else {
			return null;
		}
	}

}