package com.clover.appointment.service;
	
	import java.io.IOException;
	import java.util.List;
	
	import org.json.simple.parser.ParseException;
	
	import com.clover.appointment.bean.AdminBean;
	import com.clover.appointment.entity.Doctordetails;
	import com.clover.appointment.entity.Patientsdetails;
	import com.fasterxml.jackson.core.JsonParseException;
	import com.fasterxml.jackson.databind.JsonMappingException;
	
	public interface Adminservice {
	
		public void save(AdminBean employeeobj) throws ParseException, JsonParseException, JsonMappingException, IOException ;
	
		public List<Patientsdetails> getdetails(int getdoctordetails);
	
	}
