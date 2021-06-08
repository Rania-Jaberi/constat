package com.constat.pfe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rapport")
public class Rapport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	private String nomExpert;
	
	private String dateDeCreation;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomExpert() {
		return nomExpert;
	}

	public void setNomExpert(String nomExpert) {
		this.nomExpert = nomExpert;
	}

	public String getDateDeCreation() {
		return dateDeCreation;
	}

	public void setDateDeCreation(String dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	@Override
	public String toString() {
		return "Rapport [id=" + id + ", nomExpert=" + nomExpert + ", dateDeCreation=" + dateDeCreation + "]";
	}

	public Rapport() {
		super();
		// TODO Auto-generated constructor stub
	}
}