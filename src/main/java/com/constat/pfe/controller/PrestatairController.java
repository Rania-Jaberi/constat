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

import com.constat.pfe.entities.Prestataire;
import com.constat.pfe.repository.PrestataireRepository;







@CrossOrigin("*")
@RestController
@RequestMapping("/prestataire")
public class PrestatairController {
	@Autowired
	private PrestataireRepository prestataireRepository;
	
	
	@GetMapping("/prestataires")
	public List<Prestataire> getAllPrestataires() {
		return prestataireRepository.findAll();
	}
	
    @PostMapping("/enregistrer")
	public Prestataire addPrestataire(@RequestBody Prestataire prestataire) {

		return prestataireRepository.save(prestataire);
	}
	
	
	@GetMapping("/prestataire/{id}")
	public Prestataire getPrestataire(@PathVariable("id") Long id) {
		try {
			return prestataireRepository.findById(id).get();
		} catch (Exception e) {

		}
		return null;
	}
	
	@PutMapping("/modifier/{id}")
	public Prestataire editPrestataire(@PathVariable("id") long id, @RequestBody Prestataire prestataire) {
		Optional<Prestataire> prestataireById = prestataireRepository.findById(id);
		if (prestataireById.isPresent()) {
			Prestataire prestataireUpdate = prestataireById.get();
//			Assure assureToUpdate = new Assure() ; 
			prestataireUpdate.setNom(prestataire.getNom());
			prestataireUpdate.setMotDePasse(prestataire.getMotDePasse());
			prestataireUpdate.setTelephone(prestataire.getTelephone());
			prestataireUpdate.setAdresse(prestataire.getAdresse());
			prestataireRepository.save(prestataireUpdate);
			return prestataireUpdate;
		} else {
			return null;
		}
	}
	
	@DeleteMapping("/supprimer/{id}")
	public void deletePrestataire(@PathVariable("id") Long id) {
		prestataireRepository.deleteById(id);
	}

	
}