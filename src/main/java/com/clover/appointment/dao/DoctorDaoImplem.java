package com.clover.appointment.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.query.Query;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clover.appointment.entity.Adminregistration;
import com.clover.appointment.entity.Doctordetails;
import com.clover.appointment.entity.city;
import com.clover.appointment.entity.state;

@Repository
public class DoctorDaoImplem implements DoctorDao{

	@Autowired
	private EntityManager entitymanager;
	
	@Override
	public List<Adminregistration> get1(String l) {
		System.out.println("in doctorimplem"+l);
		Session currentsession=entitymanager.unwrap(Session.class);
//		String SQL = "from Doctordetails where specialization=:"+l;
//	l="brain";
		Query query = currentsession.createQuery("from Adminregistration where specialization=:l");
		query.setParameter("l",l);
		List<Adminregistration> list=query.getResultList();
		
		
		
//		Criteria c=currentsession.createCriteria(Doctordetails.class);  
//		c.add(Restrictions.eq("specialization",l));
//		List list1=c.list();  
//		System.out.println("criteria lis ::"+list1.toString());
	
		
		return list;
	}

	@Override
	public List<Doctordetails> getdetails(int id) {
		System.out.println("in doctorimplem"+id);
		Session currentsession=entitymanager.unwrap(Session.class);
		
		Query query = currentsession.createQuery("from Doctordetails where id=:id");
		query.setParameter("id",id);
		List<Doctordetails> list=query.getResultList();
		
		return list;
	}

	@Override
	public List<state> getdetailsofstate() {
		System.out.println("in doctorimplem");
		Session currentsession=entitymanager.unwrap(Session.class);
		
		Query query = currentsession.createQuery("from state");
		
		List<state> list=query.getResultList();
		
		return list;
	}

	



	@Override
	public List<city> getdetailsofcity(int cityid) {
		System.out.println("in doctorimplem"+cityid);
		Session currentsession=entitymanager.unwrap(Session.class);
		Query query = currentsession.createQuery("from city where stateid.stateid=:stateid");
		query.setParameter("stateid",cityid);
		
//		city c=new city();
//		c=(city) query.list();
//		System.out.println("c object"+c.toString());
		List<city> list=query.list();
		System.out.println(list.toString());
		String a = String.valueOf(list);
		System.out.println(a);
		
		System.out.println(list.toString());
		
		return list;
	}
	
}

