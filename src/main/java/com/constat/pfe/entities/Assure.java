package com.constat.pfe.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("Assure")
public class Assure extends Utilisateur {

	@OneToMany(targetEntity = Voiture.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "role_id")
	private List<Voiture> users;

	public List<Voiture> getUsers() {
		return users;
	}

	@OneToOne(cascade = { CascadeType.ALL })
	private Assurance assurance;

	public Assurance getAssurance() {
		return assurance;
	}

	public void setAssurance(Assurance assurance) {
		this.assurance = assurance;
	}

	public void setUsers(List<Voiture> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Assure [users=" + users + ", assurance=" + assurance + ", getPrenom()=" + getPrenom()
				+ ", getNumeroCin()=" + getNumeroCin() + ", getDateDeNaissance()=" + getDateDeNaissance()
				+ ", getProfession()=" + getProfession() + ", getId()=" + getId() + ", getNom()=" + getNom()
				+ ", getAdresse()=" + getAdresse() + ", getNaissance()=" + getNaissance() + ", getTelephone()="
				+ getTelephone() + ", getNomUtilisateur()=" + getNomUtilisateur() + ", getMotDePasse()="
				+ getMotDePasse() + "]";
	}


//	 @OneToOne(fetch = FetchType.LAZY,
//	            cascade =  CascadeType.ALL,
//	            mappedBy = "assure")
//	private Assurance assurance ; 

}
