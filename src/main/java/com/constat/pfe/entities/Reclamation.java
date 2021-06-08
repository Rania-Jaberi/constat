package com.constat.pfe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Reclamation")
public class Reclamation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	private String nomAssure;
	
	private String Objet;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomAssure() {
		return nomAssure;
	}

	public void setNomAssure(String nomAssure) {
		this.nomAssure = nomAssure;
	}

	public String getObjet() {
		return Objet;
	}

	public void setObjet(String objet) {
		Objet = objet;
	}

	public String getDateDeCreation() {
		return dateDeCreation;
	}

	public void setDateDeCreation(String dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	@Override
	public String toString() {
		return "Reclamation [id=" + id + ", nomAssure=" + nomAssure + ", Objet=" + Objet + ", dateDeCreation="
				+ dateDeCreation + "]";
	}

	public Reclamation() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String dateDeCreation;
	
}