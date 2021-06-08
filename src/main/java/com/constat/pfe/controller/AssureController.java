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
import com.constat.pfe.repository.AssureRepository;

@CrossOrigin("*")

@RestController
@RequestMapping("/assure")
public class AssureController {
	@Autowired
	private AssureRepository assureRepository;

	@GetMapping("/assures")
	public List<Assure> getAllAssures() {
		return assureRepository.findAll();
	}

	@PostMapping("/enregistrer")
	public Assure addAssure(@RequestBody Assure assure) {

		return assureRepository.save(assure);
	}

	@GetMapping("/assure/{id}")
	public Assure getAssure(@PathVariable("id") Long id) {

		return assureRepository.findById(id).get();

	}

	@DeleteMapping("/supprimer/{id}")
	public void deleteAssure(@PathVariable("id") Long id) {
		assureRepository.deleteById(id);
	}

	@PutMapping("/modifier/{id}")
	public Assure editAssure(@PathVariable("id") long id, @RequestBody Assure assure) {
		Optional<Assure> assureById = assureRepository.findById(id);
		if (assureById.isPresent()) {
			Assure assureUpdate = assureById.get();
//			Assure assureToUpdate = new Assure() ; 
			assureUpdate.setNom(assure.getNom());
			assureUpdate.setMotDePasse(assure.getMotDePasse());
			assureUpdate.setTelephone(assure.getTelephone());
			assureUpdate.setAdresse(assure.getAdresse());
			assureRepository.save(assureUpdate);
			return assureUpdate;
		} else {
			return null;
		}
	}
}
