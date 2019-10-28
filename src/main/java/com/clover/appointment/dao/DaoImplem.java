/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clover.appointment.dao;



import javax.persistence.EntityManager;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.clover.appointment.bean.LoginBean;
import com.clover.appointment.bean.RegisterBean;
import com.clover.appointment.entity.Adminregistration;
import com.clover.appointment.entity.Doctordetails;
import com.clover.appointment.entity.Registration;




















/**
 *
 * @author adms.java1
 */
@Repository
public class DaoImplem implements SimpleDao {
	/*
	 * @Autowired private SessionFactory sessionfactory;
	 */
	@Autowired
	private EntityManager entitymanager;
	

	//public SendMail sendmail; 

	@Override
	public void save(Registration emp) {

		/*
		 * System.out.println("IMPL::" + emp.getUserid()); Session s
		 * =this.sessionfactory.openSession(); Transaction t = s.beginTransaction();
		 * s.saveOrUpdate(emp); //int id1=s.update(student);
		 * System.out.println("in here"); t.commit(); s.close();
		 */

		System.out.println(emp.getUserid());
		Session currentsession = entitymanager.unwrap(Session.class);
		currentsession.saveOrUpdate(emp);

	}

	@Override
	public LoginBean checkLogin(LoginBean t) {
		// return t;

		System.out.println("login saving daoImpl" + t.getUsername());
		// Session currentsession = entitymanager.unwrap(Session.class);
		// String sql = ;
		// Query query = sessionfactory.getCurrentSession().createQuery("from
		// Registration where username=:username AND password=:password");
		Session currentsession = entitymanager.unwrap(Session.class);
		String SQL = "from Registration where username=:username AND password=:password";
		Query query = currentsession.createQuery(SQL);
		query.setParameter("username", t.getUsername());
		query.setParameter("password", t.getPassword());

		System.out.println("in theres" + query.uniqueResult());
		Registration emp1 = (Registration) query.uniqueResult();
		System.out.println("after check" + emp1);
		if (emp1 == null) {
			System.out.println("false");

			t.setStatus("not Exist");
			return t;
		} else {

			t.setUserid(Integer.toString(emp1.getUserid()));
			t.setStatus("Exist");
			return t;
		}

	}

	@Override
	public Registration get(int id) {
		Session currentsession = entitymanager.unwrap(Session.class);
		Registration empobj = currentsession.get(Registration.class, id);
		return empobj; 
	}

	@Override
	public void delete(int id) {
		Session currentsession = entitymanager.unwrap(Session.class);
		Registration empobj = currentsession.get(Registration.class, id);
		currentsession.delete(empobj);
	}

	@Override
	public void update(Registration registration) {
		System.out.println("daoimplem ::" + registration);
		try {
			Session currentsession = entitymanager.unwrap(Session.class);
			
//			Registration empobj = currentsession.get(Registration.class, registration.getUserid());
//			System.out.println("GET DATA BY ID IN DAO ::" + empobj);
		
//			empobj.setFirstname("a");
//			empobj.setLastname("a");
//			empobj.setConfirmpassword("a");
//			empobj.setEmail("a");
//			empobj.setMobile("a");
//			empobj.setPassword("a");
//			empobj.setSalutation("a");
//			empobj.setUsername("a");
//			System.out.println("After daoimplem ::" + empobj);
			currentsession.update(registration);
			
			//currentsession.merge(empobj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	
		
	}

	@Override
	public void forgetpassword(String pass) {
		System.out.println("in doctorimplem"+pass);
		Session currentsession=entitymanager.unwrap(Session.class);
//		String SQL = "from Doctordetails where specialization=:"+l;
//	l="brain";
		String SQL = "from Registration where email=:emailid";				
		Query query = currentsession.createQuery(SQL);
		query.setParameter("emailid", pass);
		
		System.out.println(query.toString());
		System.out.println("in theres" + query.uniqueResult());
		
		Registration list = (Registration) query.uniqueResult();
	
		System.out.println("in list"+list.getUserid()+list.getPassword()+list.getEmail());
		Samplemail sendmail=new Samplemail();
		sendmail.sendmail(list.getUserid(), list.getPassword(),list.getEmail());
	
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		final String user = list.getEmail();// change accordingly
//		final String password = "Tejas@123456";// change accordingly
//
//		// 1) get the session object
//		Properties properties = System.getProperties();
//		properties.setProperty("mail.smtp.host", "email.cloverinfotech.com");
//		properties.put("mail.smtp.auth", "true");
//
//		
//	    Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
//		protected PasswordAuthentication getPasswordAuthentication() {
//		return new PasswordAuthentication(user, password);
//		}
//		});
//
//		// 2) compose message
//		try {
//		MimeMessage message = new MimeMessage(session);
//		message.setFrom(new InternetAddress(user));
//		message.addRecipient(Message.RecipientType.TO, new InternetAddress("to"));
//		message.setSubject("Hello your password is here");
//
//		// 3) create MimeBodyPart object and set your message text
//		BodyPart messageBodyPart1 = new MimeBodyPart();
//		messageBodyPart1.setText("your password is"+list.getPassword());
//
////		// 4) create new MimeBodyPart object and set DataHandler object to
////		// this object
////		MimeBodyPart messageBodyPart2 = new MimeBodyPart();
////
////		String filename = "D:\\files\\IncomeAccount.xlsx";// change accordingly
////		DataSource source = new FileDataSource(filename);
////		messageBodyPart2.setDataHandler(new DataHandler(source));
////		messageBodyPart2.setFileName(filename);
//
//		// 5) create Multipart object and add MimeBodyPart objects to this
//		// object
//		Multipart multipart = new MimeMultipart();
//		multipart.addBodyPart(messageBodyPart1);
//		//multipart.addBodyPart(messageBodyPart2);
//
//		// 6) set the multiplart object to the message object
//		message.setContent(multipart);
//
//		// 7) send message
//		Transport.send(message);
//
//		System.out.println("message sent....");
//		} 
//		catch (MessagingException ex) 
//		{
//		ex.printStackTrace();
//		}
	}

	@Override
	public Adminregistration checkadminLogin(LoginBean t1) {
		System.out.println("login saving daoImpl" + t1.getUsername());
		// Session currentsession = entitymanager.unwrap(Session.class);
		// String sql = ;
		// Query query = sessionfactory.getCurrentSession().createQuery("from
		// Registration where username=:username AND password=:password");
		Session currentsession = entitymanager.unwrap(Session.class);
		String SQL = "from Adminregistration where username=:username AND password=:password";
		Query query = currentsession.createQuery(SQL);
		query.setParameter("username", t1.getUsername());
		query.setParameter("password", t1.getPassword());

		System.out.println("in theres" + query.uniqueResult());
		Adminregistration emp1 = (Adminregistration) query.uniqueResult();
		System.out.println("after check" + emp1);
		if (emp1 == null) {
			System.out.println("false");

			t1.setStatus("not Exist");
			System.out.println("NULL ::"+emp1.toString());
			return emp1;
		} else {

			t1.setUserid(Integer.toString(emp1.getUserid()));
			t1.setStatus("Exist");
			return emp1;
		
	}
	}
}