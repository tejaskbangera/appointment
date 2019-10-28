package com.clover.appointment.dao;
import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  
  
public class Samplemail  
{  

	 
//	public static void main(String args[]) {
	 
     
public void sendmail(int userid, String password, String email) {
	// TODO Auto-generated method stub
	System.out.println(email);
	System.out.println(password);
	System.out.println(userid);
	System.out.println("in here");
	 String to = email;//change accordingly  
     String from = "tejas.bangera@cloverinfotech.com";//change accordingly  
     String host = "email.cloverinfotech.com";//or IP address  
 
    //Get the session object  
     Properties properties = System.getProperties();  
     properties.setProperty("mail.smtp.host", host);  
     Session session = Session.getDefaultInstance(properties);  
 
    //compose the message  
     try{  
        MimeMessage message = new MimeMessage(session);  
        message.setFrom(new InternetAddress(from));  
        message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
        message.setSubject("Password for appointment");  
        message.setText("Hello, Here is your password  "+password);  
 
        // Send message  
        Transport.send(message);  
        System.out.println("message sent successfully....");  
 
     }catch (MessagingException mex) {mex.printStackTrace();}  
    
  }

}  