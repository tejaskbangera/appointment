
package com.clover.appointment.service;

import java.util.List;

import com.clover.appointment.entity.Adminregistration;
import com.clover.appointment.entity.Doctordetails;
import com.clover.appointment.entity.Registration;
import com.clover.appointment.entity.city;
import com.clover.appointment.entity.state;

public interface Doctorservice {

	
	
	public List<Adminregistration> get1(String l);

	public List<Doctordetails> getdetails(int id);

	public List<state> getdetailsofstate();

	public List<city> getdetailsofcity(int cityid);

}