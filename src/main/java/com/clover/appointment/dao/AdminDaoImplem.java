package com.clover.appointment.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clover.appointment.entity.Adminregistration;
import com.clover.appointment.entity.Doctorpatient;
import com.clover.appointment.entity.Patientsdetails;

@Repository
public class AdminDaoImplem implements AdminDao {

	@Autowired
	private EntityManager entitymanager;

	@Override
	public void save(Adminregistration adminregistration) {
		System.out.println(adminregistration.getUserid());
		Session currentsession = entitymanager.unwrap(Session.class);
		currentsession.saveOrUpdate(adminregistration);

	}

	@Override
	public List<Patientsdetails> getpatientsdetail(int getdoctordetails) {
		System.out.println("in doctorimplem" + getdoctordetails);
		Session currentsession = entitymanager.unwrap(Session.class);
//		String SQL = "from Doctordetails where specialization=:"+l;
//	l="brain";
		Adminregistration adminregistration = new Adminregistration();
		adminregistration.setUserid(getdoctordetails);
		System.out.println("adminregistration IN IMPL" + adminregistration);

		Query query = currentsession
				.createQuery("from Doctorpatient d Join Patientsdetails p  ON d.patientid=p.id where d.doctorid=:l");
		query.setParameter("l", adminregistration);
		List<Patientsdetails> list = query.getResultList();
		System.out.println("list IN IMPL" + list.toString());

//		Criteria c=currentsession.createCriteria(Doctordetails.class);  
//		c.add(Restrictions.eq("specialization",l));
//		List list1=c.list();  
//		System.out.println("criteria lis ::"+list1.toString());

		return list;
	}

}

