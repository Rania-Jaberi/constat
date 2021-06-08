package com.constat.pfe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Indemnisation")
public class Indemnisation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Override
	public String toString() {
		return "Indemnisation [id=" + id + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Indemnisation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}