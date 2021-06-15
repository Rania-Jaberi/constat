package com.constat.pfe.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.constat.pfe.entities.Assure;
import com.constat.pfe.entities.Expert;
import com.constat.pfe.entities.Prestataire;
import com.constat.pfe.entities.Profession;
import com.constat.pfe.entities.Utilisateur;
import com.constat.pfe.repository.UtilisateurRepository;

@Service
public class UtilisateurImpl{
	@Autowired
	UtilisateurRepository utilisateurRepository;


	public Utilisateur enregistrerVoitureVersUtilisateur(Assure utilisateur) {
		if (utilisateur.getProfession().equals(Profession.ASSURE)) {
			Assure assure = new Assure();
			assure.setNom(utilisateur.getNom());
			assure.setPrenom(utilisateur.getPrenom());
			assure.setAdresse(utilisateur.getAdresse());
			assure.setDateDeNaissance(utilisateur.getDateDeNaissance());
			assure.setNumeroCin(utilisateur.getDateDeNaissance());
			assure.setTelephone(utilisateur.getTelephone());
			assure.setProfession(utilisateur.getProfession());
			assure.setNomUtilisateur(utilisateur.getNomUtilisateur());
			assure.setMotDePasse(utilisateur.getMotDePasse());
			assure.setUsers(((Assure) utilisateur).getUsers());

			assure.setAssurance(((Assure) utilisateur).getAssurance());
			System.out.println("Assure " + assure);

			Assure savedAssure = utilisateurRepository.save(assure);

			System.out.println("SAVED -----------" + savedAssure);
			return checkUser(savedAssure);
		} else if (utilisateur.getProfession().equals(Profession.EXPERT)) {
			Expert expert = new Expert();
			expert.setNom(utilisateur.getNom());
			expert.setPrenom(utilisateur.getPrenom());
			expert.setAdresse(utilisateur.getAdresse());
			expert.setDateDeNaissance(utilisateur.getDateDeNaissance());
			expert.setNumeroCin(utilisateur.getDateDeNaissance());
			expert.setTelephone(utilisateur.getTelephone());
			expert.setProfession(utilisateur.getProfession());
			expert.setNomUtilisateur(utilisateur.getNomUtilisateur());
			expert.setMotDePasse(utilisateur.getMotDePasse());
			System.out.println("List voiture " + expert);
			Utilisateur savedexpert = utilisateurRepository.save(expert);
			return checkUser(savedexpert);
		} else if (utilisateur.getProfession().equals(Profession.PRESTATAIRE)) {
			Prestataire prestataire = new Prestataire();
			prestataire.setNom(utilisateur.getNom());
			prestataire.setPrenom(utilisateur.getPrenom());
			prestataire.setAdresse(utilisateur.getAdresse());
			prestataire.setDateDeNaissance(utilisateur.getDateDeNaissance());
			prestataire.setNumeroCin(utilisateur.getDateDeNaissance());
			prestataire.setTelephone(utilisateur.getTelephone());
			prestataire.setProfession(utilisateur.getProfession());
			prestataire.setNomUtilisateur(utilisateur.getNomUtilisateur());
			prestataire.setMotDePasse(utilisateur.getMotDePasse());
			System.out.println("List voiture " + prestataire);
			Utilisateur savedExpert = utilisateurRepository.save(prestataire);
			return checkUser(savedExpert);

		}
		return null;

	}

	private Utilisateur checkUser(Utilisateur entity) {
		if (utilisateurRepository.findById(entity.getId()).isPresent()) {
			return entity;
		} else
			return null;
	}



	

}
