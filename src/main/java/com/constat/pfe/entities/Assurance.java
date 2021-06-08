package com.constat.pfe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Assurance")
public class Assurance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nomAssurance;
	
	private String adresse;
	


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomAssurance() {
		return nomAssurance;
	}

	public void setNomAssurance(String nomAssurance) {
		this.nomAssurance = nomAssurance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	@Override
	public String toString() {
		return "Assurance [id=" + id + ", nomAssurance=" + nomAssurance + ", adresse=" + adresse
				+ "]";
	}

	public Assurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
	