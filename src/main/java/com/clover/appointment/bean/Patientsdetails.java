
package com.clover.appointment.bean;

import java.util.Date;

public class Patientsdetails {

	private int id;
	private String 	firstname;
	private String lastname;
	private Date date;
	private int age;
	private String disease;
	private String treatmentbefore;
	private Date period;
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
	public Date getPeriod() {
		return period;
	}
	public void setPeriod(Date period) {
		this.period = period;
	}
	@Override
	public String toString() {
		return "Patientsdetails [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", date=" + date
				+ ", age=" + age + ", disease=" + disease + ", treatmentbefore=" + treatmentbefore + ", period="
				+ period + "]";
	}
	
	
	
	
	
}
