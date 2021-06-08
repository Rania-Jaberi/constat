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

import com.constat.pfe.entities.Voiture;

import com.constat.pfe.repository.VoitureRepository;



@CrossOrigin("*")

@RestController
@RequestMapping("/voiture")
public class VoitureController {
	
	@Autowired
	private VoitureRepository voitureRepository;

	@GetMapping("/voitures")
	public List<Voiture> getAllVoitures() {
		return voitureRepository.findAll();
	}
	
	@GetMapping("/voiture/{id}")
	public Voiture getVoiture(@PathVariable("id") Long id) {

		return voitureRepository.findById(id).get();

	}
	
	@PostMapping("/enregistrer")
	public Voiture addVoiture(@RequestBody Voiture voiture) {

		return voitureRepository.save(voiture);
	}
	
	@DeleteMapping("/supprimer/{id}")
	public void deleteVoiture(@PathVariable("id") Long id) {
		voitureRepository.deleteById(id);
	}
	
	@PutMapping("/modifier/{id}")
	public Voiture editVoiture(@PathVariable("id") long id, @RequestBody Voiture voiture) {
		Optional<Voiture> voitureById = voitureRepository.findById(id);
		if (voitureById.isPresent()) {
			Voiture voitureUpdate = voitureById.get();
//			Voiture voitureToUpdate = new Voiture() ; 
			voitureUpdate.setCouleur(voiture.getCouleur());
			voitureUpdate.setMarque(voiture.getMarque());
			
			voitureRepository.save(voitureUpdate);
			return voitureUpdate;
		} else {
			return null;
		}
	}



}