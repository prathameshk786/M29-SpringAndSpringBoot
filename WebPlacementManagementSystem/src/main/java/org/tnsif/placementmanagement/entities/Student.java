package org.tnsif.placementmanagement.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	//private data members
	@Id
	private Integer id;
	private String name;
	private Integer roll;
	private String qualification;
	private String course;
	private Integer year;
	private Integer hallticketno;
	
//	@OneToOne
//    @JoinColumn(name = "certificate_id")
//	private Certificate certificate;
//	
//	@ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "college_id")
//	private College college;
//	
	//Default constructor
	public Student() {
		System.out.println("Demonstration on SpringBoot-REST API");
	}
	
	
	public Student(Integer id, String name, Integer roll, String qualification, String course, Integer year,
			Integer hallticketno) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.hallticketno = hallticketno;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getRoll() {
		return roll;
	}


	public void setRoll(Integer roll) {
		this.roll = roll;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}


	public Integer getHallticketno() {
		return hallticketno;
	}


	public void setHallticketno(Integer hallticketno) {
		this.hallticketno = hallticketno;
	}


//	public College getCollege() {
//		return college;
//	}
//
//
//	public void setCollege(College college) {
//		this.college = college;
//	}
//

//	public Certificate getCertificate() {
//		return certificate;
//	}
//
//
//	public void setCertificate(Certificate certificate) {
//		this.certificate = certificate;
//	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roll=" + roll + ", qualification=" + qualification
				+ ", course=" + course + ", year=" + year + ", hallticketno=" + hallticketno + "]";
	}
	
	
}
