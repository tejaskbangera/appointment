
package com.clover.appointment.controller;

import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clover.appointment.bean.RegisterBean;
import com.clover.appointment.entity.Adminregistration;
import com.clover.appointment.entity.Doctordetails;
import com.clover.appointment.entity.Patientsdetails;
import com.clover.appointment.service.Adminservice;
import com.clover.appointment.service.Simpleservice;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.clover.appointment.bean.AdminBean;
import com.clover.appointment.bean.LoginBean;

@CrossOrigin(origins = "*")
//@CrossOrigin("*")
@RestController
public class AdminController {

	@Autowired
	private Adminservice service1;

	@Autowired
	private Simpleservice service;

	@PostMapping(value = "/adminregister")
	public AdminBean save(@RequestBody AdminBean employeeobj)
			throws ParseException, JsonParseException, JsonMappingException, IOException {
		System.out.println("in controller");
		System.out.println("just username and password" + employeeobj.getUsername() + employeeobj.getPassword());

		service1.save(employeeobj);
		return employeeobj;

	}

	@RequestMapping(value = "/adminlogin", method = RequestMethod.POST)
	public Adminregistration adminlogin(@RequestBody LoginBean t1) {

		System.out.println("Getting List of all Users ");
		Adminregistration check = null;
		try {
			check = service.checkadminLogin(t1);

			return check;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("NULL In controller" + check);
			e.printStackTrace();
			check.setLastname("not valid");
			return null;
		}
		
//	        System.out.println("In controller" + check);
//	        String status = check.getUsername();
//	        System.out.println("check Status" + status);

		
//	        if (status == "exist") {
//	            System.out.println("Exist");
//	            return new ResponseEntity<LoginBean>(check, HttpStatus.OK);
//	        } else {
//	          
//	            return new ResponseEntity<LoginBean>(check, HttpStatus.NOT_FOUND);
//	        }

	}
	
 
	@RequestMapping(value = "/getpatientsdetails/{getdoctordetails}", method = RequestMethod.POST)
	
	public List<Patientsdetails> getdetails(@PathVariable int getdoctordetails) {
		
		System.out.println("in here"+getdoctordetails);
		return service1.getdetails(getdoctordetails);
	}
}