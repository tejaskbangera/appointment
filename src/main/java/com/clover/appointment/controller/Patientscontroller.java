package com.clover.appointment.controller;


import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.clover.appointment.bean.Patientsdetailsbean;
import com.clover.appointment.bean.RegisterBean;
import com.clover.appointment.entity.BrainPatient;
import com.clover.appointment.entity.HeartPatient;
import com.clover.appointment.entity.LegsPatient;
import com.clover.appointment.entity.Registration;
import com.clover.appointment.entity.city;
import com.clover.appointment.service.Patientservice;
import com.clover.appointment.service.Simpleservice;

/**
 *
 * @author adms.java1
 */
@CrossOrigin(origins = "*")
//@CrossOrigin("*")
 @RestController
 public class Patientscontroller
 {
	
	@Autowired
	private Patientservice servicing;
	
	 @PostMapping(value="/patientregistration")    
	    public Patientsdetailsbean save(@RequestBody Patientsdetailsbean employeeobj) {
	        System.out.println("patientregistration in controller ::"+employeeobj.toString());
	      
	        
	        servicing.save(employeeobj);
	        return employeeobj;

	    }
	 
	 @PostMapping(value="/heartpatientregistration")    
	    public HeartPatient save1(@RequestBody HeartPatient employeeobj) {
	        System.out.println("in controller");
	      
	        
	        servicing.save1(employeeobj);
	        return employeeobj;

	    }
	 
	 @PostMapping(value="/brainpatientregistration")    
	    public BrainPatient save2(@RequestBody BrainPatient employeeobj) {
	        System.out.println("in controller");
	      
	        
	        servicing.save2(employeeobj);
	        return employeeobj;

	    }
	 
	 @PostMapping(value="/legspatientregistration")    
	    public LegsPatient save3(@RequestBody LegsPatient employeeobj) {
	        System.out.println("in controller");
	      
	        
	        servicing.save3(employeeobj);
	        return employeeobj;

	    }
 }