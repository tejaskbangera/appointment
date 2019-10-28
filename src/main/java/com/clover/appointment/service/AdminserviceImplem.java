package com.clover.appointment.service;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clover.appointment.bean.AdminBean;
import com.clover.appointment.bean.Data;
import com.clover.appointment.dao.AdminDao;
import com.clover.appointment.entity.Adminregistration;
import com.clover.appointment.entity.Patientsdetails;
import com.clover.appointment.entity.Registration;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@Service
public class AdminserviceImplem implements Adminservice {

	@Autowired
	private AdminDao dao;

	@Override
	@Transactional
	public void save(AdminBean employeeobj) throws ParseException {
		// TODO Auto-generated method stub

		String lang = employeeobj.getLanguagesspoken();
		System.out.println("Before ::"+lang);
		lang = lang.replaceAll("[^a-zA-Z0-9]", "");
		lang = lang.replaceAll("languagesspoken", ",");
		lang=lang.substring(1);
		System.out.println("After ::"+lang);
		employeeobj.setLanguagesspoken(lang);
		ObjectMapper mapper = new ObjectMapper();
				Adminregistration adminregistration = mapper.convertValue(employeeobj, Adminregistration.class);
				
		System.out.println(">>>" + adminregistration.toString());
		dao.save(adminregistration);
	}

	@Override
	public List<Patientsdetails> getdetails(int getdoctordetails) {
		// TODO Auto-generated method stub
		return dao.getpatientsdetail(getdoctordetails);
	}
	
	
	

}