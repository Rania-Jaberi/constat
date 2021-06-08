package com.constat.pfe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Utilisateur")
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ; 
	private String nomUtilisateur ; 
	private String motDepaasse ;
	
	public Utilisateur() {
		super();
	}
	public Utilisateur(long id, String nomUtilisateur, String motDepaasse) {
		super();
		this.id = id;
		this.nomUtilisateur = nomUtilisateur;
		this.motDepaasse = motDepaasse;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	public String getMotDepaasse() {
		return motDepaasse;
	}
	public void setMotDepaasse(String motDepaasse) {
		this.motDepaasse = motDepaasse;
	}
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nomUtilisateur=" + nomUtilisateur + ", motDepaasse=" + motDepaasse + "]";
	} 
	
	

}
