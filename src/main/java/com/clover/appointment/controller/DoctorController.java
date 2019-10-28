
package com.clover.appointment.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
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

import com.clover.appointment.entity.Adminregistration;
import com.clover.appointment.entity.Doctordetails;
import com.clover.appointment.entity.Registration;
import com.clover.appointment.entity.city;
import com.clover.appointment.entity.state;
import com.clover.appointment.service.Doctorservice;
import com.clover.appointment.service.Simpleservice;

@CrossOrigin(origins = "*")
//@CrossOrigin("*")
@RestController
public class DoctorController {

	 @Autowired
	    private Doctorservice docservice;
	 
	
	/*
	 * @PostMapping("/doctordetails") public List<Doctordetails>
	 * get1(@RequestParam("l") String l){ System.out.println("controller2"+l);
	 * return docservice.get1(l); }
	 */
	
	@PostMapping("/doctordetails1") 
	public List<Adminregistration> get12(@RequestParam("b") String l){
		System.out.println("controller3"+l);
		return docservice.get1(l);
	}
	
	/*
	 * @PostMapping("/doctordetails2") public List<Doctordetails>
	 * get3(@RequestParam("h") String l){ System.out.println("controller4"+l);
	 * return docservice.get1(l); }
	 */
	
	
	@PostMapping("/doctordetailsspecial")
	public List<Doctordetails> getdetails(@RequestParam("di") int id) {
		
		System.out.println("in here"+id);
		return docservice.getdetails(id);
	}
	
	@GetMapping("/getdetailsofstate")
	public List<state> getdetailsofstate() {
		
		System.out.println("in here");
		return docservice.getdetailsofstate();
	}
	
	   @GetMapping("/getdetailsofcity/{x}")
		public List<city> getdetailsofcity(@PathVariable int x) {
		 
			
			//System.out.println("edit ::"+regobj.toString());
			return docservice.getdetailsofcity(x);
		}
}

