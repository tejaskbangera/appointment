/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

import com.clover.appointment.bean.RegisterBean;
import com.clover.appointment.entity.Registration;
import com.clover.appointment.entity.city;
import com.clover.appointment.service.Simpleservice;

/**
 *
 * @author adms.java1
 */
@CrossOrigin(origins = "*")
//@CrossOrigin("*")
@RestController
public class MainController {

     @Autowired
    private Simpleservice service;
     
     @RequestMapping("/")
 	public String hello() {
 		
 		return "readfileinjsp.jsp";
 	}
     
    @RequestMapping("/index")
    public ModelAndView getIndexPage(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(">>>>>>>For Super");
        ModelAndView mav=new ModelAndView("index");
        Object hi = "hi";
        mav.addObject("hi",hi);
        return mav;
    }

    

    @RequestMapping("/index1")
    public String get() {
        System.out.println("Hello");
        return null;
    }
    
    @PostMapping(value="/saveemployees")    
    public RegisterBean save(@RequestBody RegisterBean employeeobj) {
        System.out.println("in controller");
        System.out.println("just username and password"+employeeobj.getUsername()+employeeobj.getPassword());
        
        service.save(employeeobj);
        return employeeobj;

    }
    
    @PutMapping(value="/update")    
    public RegisterBean update(@RequestBody RegisterBean detail) {
        System.out.println("in controller "+detail.toString());
        service.update(detail);
        return detail;

    }
    
    @GetMapping("/edit/{id}")
	public Registration get(@PathVariable int id) {
    	Registration regobj= service.get(id);
		if(regobj==null)
		{
			throw new RuntimeException("Employee is not present");
		}
		System.out.println("edit ::"+regobj.toString());
		return regobj;
	}
    
    @DeleteMapping("/delete/{id}")
	public int delete(@PathVariable String id){
    	int idd=Integer.valueOf(id);
		service.delete(idd);
		System.out.println("mains");
		return 1;
		
	}
    
    @PostMapping(value="/forgetpassword")    
    public String forgetpassword(@RequestParam("pass") String pass) {
        System.out.println("in controller");
       try {
          service.forgetpassword(pass);
       }
       catch(Exception e) {
    	   return "failed";
       }
          return "pass";
          

    }
 
}

