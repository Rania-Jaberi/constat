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
import com.constat.pfe.entities.Expert;
import com.constat.pfe.repository.ExpertRepository;





@CrossOrigin("*")
@RestController
@RequestMapping("/expert")
public class ExpertController {
//	@Autowired
//	private ExpertRepository expertRepository;
//
//	@GetMapping("/experts")
//	public List<Expert> getAllExperts() {
//		return expertRepository.findAll();
//	}
//	
//	
//	@GetMapping("/expert/{id}")
//	public Expert getExpert(@PathVariable("id") Long id) {
//		try {
//			return expertRepository.findById(id).get();
//		} catch (Exception e) {
//
//		}
//		return null;
//	}
//	
//	@PostMapping("/enregistrer")
//	public Expert addExpert(@RequestBody Expert expert) {
//
//		return expertRepository.save(expert);
//	}
//	
//	
//	@PutMapping("/modifier/{id}")
//	public Expert editExpert(@PathVariable("id") long id, @RequestBody Expert expert) {
//		Optional<Expert> expertById = expertRepository.findById(id);
//		if (expertById.isPresent()) {
//			Expert expertUpdate = expertById.get();
////			Assure assureToUpdate = new Assure() ; 
//			expertUpdate.setNom(expert.getNom());
//			expertUpdate.setMotDePasse(expert.getMotDePasse());
//			expertUpdate.setTelephone(expert.getTelephone());
//			expertUpdate.setAdresse(expert.getAdresse());
//			expertRepository.save(expertUpdate);
//			return expertUpdate;
//		} else {
//			return null;
//		}
//	}
//	
//	@DeleteMapping("/supprimer/{id}")
//	public void deleteExpert(@PathVariable("id") Long id) {
//		expertRepository.deleteById(id);
//	}

	}