package com.constat.pfe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEST")
public class TestConstat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String password;
	

	public TestConstat() {
		super();
	}

	public TestConstat(long id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "TestConstat [id=" + id + ", password=" + password + "]";
	}

}
