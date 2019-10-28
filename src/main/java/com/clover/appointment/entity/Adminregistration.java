
package com.clover.appointment.entity;



import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "adminregister")
public class Adminregistration {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int userid;
	
	private String firstname;
	private String lastname;
	private int age;
	private String qualification;
	private String address;
	private String state;
	private String city;
	private String landmark;
	private int pincode;
	
	private String aboutmyself;
	private String specialization;
	private String educationandtraining;
	
	private String professionalmemberships;
	private String gender;
	private int mobnumber;
	private String languagesspoken;
	private String username;
	private String password;
	private String cpassword;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAboutmyself() {
		return aboutmyself;
	}
	public void setAboutmyself(String aboutmyself) {
		this.aboutmyself = aboutmyself;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getEducationandtraining() {
		return educationandtraining;
	}
	public void setEducationandtraining(String educationandtraining) {
		this.educationandtraining = educationandtraining;
	}
	public String getProfessionalmemberships() {
		return professionalmemberships;
	}
	public void setProfessionalmemberships(String professionalmemberships) {
		this.professionalmemberships = professionalmemberships;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMobnumber() {
		return mobnumber;
	}
	public void setMobnumber(int mobnumber) {
		this.mobnumber = mobnumber;
	}
	public String getLanguagesspoken() {
		return languagesspoken;
	}
	public void setLanguagesspoken(String languagesspoken) {
		this.languagesspoken = languagesspoken;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	@Override
	public String toString() {
		return "Adminregistration [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", age="
				+ age + ", qualification=" + qualification + ", address=" + address + ", state=" + state + ", city="
				+ city + ", landmark=" + landmark + ", pincode=" + pincode + ", aboutmyself=" + aboutmyself
				+ ", specialization=" + specialization + ", educationandtraining=" + educationandtraining
				+ ", professionalmemberships=" + professionalmemberships + ", gender=" + gender + ", mobnumber="
				+ mobnumber + ", languagesspoken=" + languagesspoken + ", username=" + username + ", password="
				+ password + ", cpassword=" + cpassword + "]";
	}
	
	
	
	
}