package org.tnsif.placementmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Certificate {

	//private data members
	@Id
	private Integer id;
	private Integer year;

	//Default constructor
	public Certificate() {
		System.out.println("Demonstration on SpringBoot-REST API");
	}
	
	//parameterized constructor
	public Certificate(Integer id, Integer year) {
		super();
		this.id = id;
		this.year = year;
	}
	
	//setters and getters 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Certificate [id=" + id + ", year=" + year + "]";
	}
	
	
}
