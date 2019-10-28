package com.clover.appointment.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.clover.appointment.dao.DoctorDao;
import com.clover.appointment.dao.SimpleDao;
import com.clover.appointment.entity.Adminregistration;
import com.clover.appointment.entity.Doctordetails;
import com.clover.appointment.entity.city;
import com.clover.appointment.entity.state;

@Service
public class DoctorserviceImplem implements Doctorservice{

	
	 @Autowired
		DoctorDao dao;
	 
	 
	@Override
	@Transactional
	public List<Adminregistration> get1(String l) {
		// TODO Auto-generated method stub
		return dao.get1(l);
	}


	@Override
	@Transactional
	public List<Doctordetails> getdetails(int id) {
		// TODO Auto-generated method stub
		return dao.getdetails(id);
	}


	@Override
	public List<state> getdetailsofstate() {
		// TODO Auto-generated method stub
		return dao.getdetailsofstate();
	}


	@Override
	public List<city> getdetailsofcity(int cityid) {
		// TODO Auto-generated method stub
		return dao.getdetailsofcity(cityid);
	}

}