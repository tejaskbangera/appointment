package com.clover.appointment.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "brainpatientsdetails")
public class BrainPatient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String 	firstname;
	private String lastname;
	private Date date;
	private int age;
	private String disease;
	private String treatmentbefore;
	private int period;
	private Date sufferringfrom;
	private String treatmentfor;
	
	
	
	
	
	public String getTreatmentfor() {
		return treatmentfor;
	}
	public void setTreatmentfor(String treatmentfor) {
		this.treatmentfor = treatmentfor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getTreatmentbefore() {
		return treatmentbefore;
	} 
	public void setTreatmentbefore(String treatmentbefore) {
		this.treatmentbefore = treatmentbefore;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public Date getSufferringfrom() {
		return sufferringfrom;
	}
	public void setSufferringfrom(Date sufferringfrom) {
		this.sufferringfrom = sufferringfrom;
	}
	@Override
	public String toString() {
		return "Patientsdetails [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", date=" + date
				+ ", age=" + age + ", disease=" + disease + ", treatmentbefore=" + treatmentbefore + ", period="
				+ period + ", sufferringfrom=" + sufferringfrom + ", treatmentfor=" + treatmentfor + "]";
	}
	
	
}

