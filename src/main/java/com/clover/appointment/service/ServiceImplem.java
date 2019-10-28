/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clover.appointment.service;



import com.clover.appointment.bean.LoginBean;
import com.clover.appointment.bean.RegisterBean;
import com.clover.appointment.dao.SimpleDao;
import com.clover.appointment.entity.Adminregistration;
import com.clover.appointment.entity.Registration;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author adms.java1
 */

@Service("service")
public class ServiceImplem implements Simpleservice{
      @Autowired
	SimpleDao dao;

	

	@Override
	
	public void save(RegisterBean emp) {
            
              ObjectMapper mapper = new ObjectMapper();
            Registration registration = mapper.convertValue(emp, Registration.class);
            System.out.println(">>>" + registration.toString());
		dao.save(registration);
		
	}
        
     

    @Override
    public LoginBean checkLogin(LoginBean t1) {
       return dao.checkLogin(t1);
    }


	@Override
	@Transactional
	public Registration get(int id) {
		// TODO Auto-generated method stub
		return dao.get(id);
	}



	@Override
	@Transactional
	public void delete(int id) {
		dao.delete(id);
		System.out.println("in serviceimplem");
		
	}



	@Override
	public void update(RegisterBean detail) {
		   ObjectMapper mapper = new ObjectMapper();
           Registration registration = mapper.convertValue(detail, Registration.class);
           System.out.println(">>>" + registration.toString());
		dao.update(registration);
		
	}



	@Override
	public void forgetpassword(String pass) {
		
		dao.forgetpassword(pass);
		
	}



	@Override
	public Adminregistration checkadminLogin(LoginBean t1) {
		 return dao.checkadminLogin(t1);	}
}
