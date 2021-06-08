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
import com.constat.pfe.entities.ChefAssurance;
import com.constat.pfe.repository.ChefAssuranceRepository;



@CrossOrigin("*")

@RestController
@RequestMapping("/chefassurance")
public class ChefAssuranceController {
	@Autowired
	private ChefAssuranceRepository chefassuranceRepository;
	
	
	@GetMapping("/chefassurances")
	public List<ChefAssurance> getAllChefAssurances() {
		return chefassuranceRepository.findAll();
	}
	
	@GetMapping("/chefassurance/{id}")
	public ChefAssurance getChefAssurance(@PathVariable("id") Long id) {

		return chefassuranceRepository.findById(id).get();

	}
	
	@PostMapping("/enregistrer")
	public ChefAssurance addChefAssurance(@RequestBody ChefAssurance chefassurance) {

		return chefassuranceRepository.save(chefassurance);
	}
	
	@DeleteMapping("/supprimer/{id}")
	public void deleteChefAssurance(@PathVariable("id") Long id) {
		chefassuranceRepository.deleteById(id);
	}
	
	
	@PutMapping("/modifier/{id}")
	public ChefAssurance editChefAssurance(@PathVariable("id") long id, @RequestBody ChefAssurance chefassurance) {
		Optional<ChefAssurance> chefassuranceById = chefassuranceRepository.findById(id);
		if (chefassuranceById.isPresent()) {
			ChefAssurance chefassuranceUpdate = chefassuranceById.get();
//			Assure assureToUpdate = new Assure() ; 
			chefassuranceUpdate.setNom(chefassurance.getNom());
			chefassuranceUpdate.setMotDePasse(chefassurance.getMotDePasse());
			chefassuranceUpdate.setTelephone(chefassurance.getTelephone());
			chefassuranceUpdate.setAdresse(chefassurance.getAdresse());
			chefassuranceRepository.save(chefassuranceUpdate);
			return chefassuranceUpdate;
		} else {
			return null;
		}
	}
	
}