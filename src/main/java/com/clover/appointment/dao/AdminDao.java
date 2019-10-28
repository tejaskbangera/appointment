 
 package com.clover.appointment.dao;

import java.util.List;

import com.clover.appointment.entity.Adminregistration;
import com.clover.appointment.entity.Patientsdetails;

public interface AdminDao {

	public void save(Adminregistration adminregistration);

	public List<Patientsdetails> getpatientsdetail(int getdoctordetails);
}
