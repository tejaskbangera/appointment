/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clover.appointment.controller;

/**
 *
 * @author adms.java1
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clover.appointment.bean.LoginBean;
import com.clover.appointment.service.Simpleservice;

@CrossOrigin("*")
@RestController
public class LoginController {

    @Autowired
    private Simpleservice service;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginBean loginData(@RequestBody LoginBean t1) {

        System.out.println("Getting List of all Users ");

        LoginBean check = service.checkLogin(t1);

        System.out.println("In controller" + check);
        String status = check.getStatus();
        System.out.println("check Status" + status);

        return check;
//        if (status == "exist") {
//            System.out.println("Exist");
//            return new ResponseEntity<LoginBean>(check, HttpStatus.OK);
//        } else {
//          
//            return new ResponseEntity<LoginBean>(check, HttpStatus.NOT_FOUND);
//        }

    }
    
    
   
}