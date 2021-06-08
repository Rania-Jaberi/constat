package com.constat.pfe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Demande")
public class Demande {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String dateDeCreation;
	
	private String nomAssure;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDateDeCreation() {
		return dateDeCreation;
	}

	public void setDateDeCreation(String dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	public String getNomAssure() {
		return nomAssure;
	}

	public void setNomAssure(String nomAssure) {
		this.nomAssure = nomAssure;
	}

	@Override
	public String toString() {
		return "Demande [id=" + id + ", dateDeCreation=" + dateDeCreation + ", nomAssure=" + nomAssure + "]";
	}

	public Demande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}