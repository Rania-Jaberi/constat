package com.constat.pfe.entities;


import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DISCRIMINATOR", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("UTILISATEUR")
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;

	private String prenom;

	  
	private String adresse;

	private String dateDeNaissance;

	private String numeroCin;

	private String telephone;

	private Profession Profession;

	private String nomUtilisateur;

	private String motDePasse;

	private String numContratAssurance;




	public void setNumContratAssurance(String numContratAssurance) {
		this.numContratAssurance = numContratAssurance;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + ", dateDeNaissance=" + dateDeNaissance + ", numeroCin=" + numeroCin + ", telephone="
				+ telephone + ", Profession=" + Profession + ", nomUtilisateur=" + nomUtilisateur + ", motDePasse="
				+ motDePasse + ", numContratAssurance=" + numContratAssurance + "]";
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumeroCin() {
		return numeroCin;
	}

	public void setNumeroCin(String numeroCin) {
		this.numeroCin = numeroCin;
	}

	public String getDateDeNaissance() {
		return dateDeNaissance;
	}

	public Profession getProfession() {
		return Profession;
	}

	public void setProfession(Profession profession) {
		this.Profession = profession;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}


 
}
