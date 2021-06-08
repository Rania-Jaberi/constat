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


import com.constat.pfe.entities.Rapport;
import com.constat.pfe.repository.RapportRepository;


@CrossOrigin("*")

@RestController
@RequestMapping("/rapport")
public class RapportController {
	@Autowired
	private RapportRepository rapportRepository;
	
	@GetMapping("/rapports")
	public List<Rapport> getAllRapports() {
		return rapportRepository.findAll();
	}
	
	@PostMapping("/enregistrer")
	public Rapport addRapport(@RequestBody Rapport rapport) {

		return rapportRepository.save(rapport);
	}
	
	@GetMapping("/rapport/{id}")
	public Rapport getRapport(@PathVariable("id") Long id) {

		return rapportRepository.findById(id).get();

	}
	
	@DeleteMapping("/supprimer/{id}")
	public void deleteRapport(@PathVariable("id") Long id) {
		rapportRepository.deleteById(id);
	}

	
	@PutMapping("/modifier/{id}")
	public Rapport editRapport(@PathVariable("id") long id, @RequestBody Rapport rapport) {
		Optional<Rapport> rapportById = rapportRepository.findById(id);
		if (rapportById.isPresent()) {
			Rapport rapportUpdate = rapportById.get();
//			Assure assureToUpdate = new Assure() ; 
			rapportUpdate.setNomExpert(rapport.getNomExpert());
			//rapportUpdate.setMotDePasse(rapport.getMotDePasse());
		//	rapportUpdate.setTelephone(rapport.getTelephone());
		    rapportRepository.save(rapportUpdate);
			return rapportUpdate;
		} else {
			return null;
		}
	}
}
