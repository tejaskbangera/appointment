/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clover.appointment.bean;

/**
 *
 * @author adms.java1
 */
public class LoginBean {
    
   private String userid;
    private String username;
    private String password;
    private String status;

   

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "LoginBean{" + "userid=" + userid + ", username=" + username + ", password=" + password + ", status=" + status + '}';
    }

 
    
    


    
}
