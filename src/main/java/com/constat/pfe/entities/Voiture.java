package com.constat.pfe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Voiture")
public class Voiture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String marque;
	
	private String numeroImmatriculation;
	
	private String couleur;
	
	private String numeroPermis;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getNumeroImmatriculation() {
		return numeroImmatriculation;
	}

	public void setNumeroImmatriculation(String numeroImmatriculation) {
		this.numeroImmatriculation = numeroImmatriculation;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getNumeroPermis() {
		return numeroPermis;
	}

	public void setNumeroPermis(String numeroPermis) {
		this.numeroPermis = numeroPermis;
	}

	@Override
	public String toString() {
		return "Voiture [id=" + id + ", marque=" + marque + ", numeroImmatriculation=" + numeroImmatriculation
				+ ", couleur=" + couleur + ", numeroPermis=" + numeroPermis + "]";
	}

	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}
}