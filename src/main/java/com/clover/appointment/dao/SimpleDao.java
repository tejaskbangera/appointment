/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clover.appointment.dao;

import com.clover.appointment.bean.LoginBean;
import com.clover.appointment.bean.RegisterBean;
import com.clover.appointment.entity.Adminregistration;
import com.clover.appointment.entity.Registration;

/**
 *
 * @author adms.java1
 */
public interface SimpleDao {

  public void save(Registration emp);

 

    public LoginBean checkLogin(LoginBean t1);



	public Registration get(int id);



	public void delete(int id);



	public void update(Registration registration);



	public void forgetpassword(String pass);



	public Adminregistration checkadminLogin(LoginBean t1);
    
}