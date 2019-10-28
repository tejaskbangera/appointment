
package com.clover.appointment.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clover.appointment.bean.AdminBean;
import com.clover.appointment.entity.Adminregistration;
import com.clover.appointment.entity.BrainPatient;
import com.clover.appointment.entity.Doctorpatient;
import com.clover.appointment.entity.HeartPatient;
import com.clover.appointment.entity.LegsPatient;
import com.clover.appointment.entity.Patientsdetails;

@Repository
public class PatientsdetailDaoImplem implements patientdetaildao {

	@Autowired
	private EntityManager entitymanager;

	@Override
	public void savedetails(Patientsdetails employeeobj, int a) {
		System.out.println("Doctor ID::" + a);
		Doctorpatient doctorpatient = new Doctorpatient();
		Adminregistration adminregistration = new Adminregistration();
		System.out.println(employeeobj.getId());
		Session currentsession = entitymanager.unwrap(Session.class);
		currentsession.saveOrUpdate(employeeobj);

		System.out.println("ID after save ::" + employeeobj.getId());

		adminregistration.setUserid(a);
		doctorpatient.setPatientid(employeeobj);
		doctorpatient.setDoctorid(adminregistration);
		
		System.out.println("doctorpatient ::" + doctorpatient.toString());
		currentsession.save(doctorpatient);

		// currentsession = entitymanager.unwrap(Session.class);
//		String SQL = "from Doctordetails where specialization=:"+l;
//	l="brain";
		// Query query = currentsession.createQuery("from Patientsdetails");
		// query.setParameter("l",l);
		// List<Patientsdetails> list = query.getResultList();

//		Criteria c=currentsession.createCriteria(Doctordetails.class);  
//		c.add(Restrictions.eq("specialization",l));
//		List list1=c.list();  
//		System.out.println("criteria lis ::"+list1.toString());

	}

//	@Override
//	public void savedetailsofheart(HeartPatient patientsdetails) {
//		// TODO Auto-generated method stub
//		System.out.println(patientsdetails.getId());
//		Session currentsession = entitymanager.unwrap(Session.class);
//		currentsession.saveOrUpdate(patientsdetails);
//		System.out.println("ID after save ::" + patientsdetails.getId());
//	}
//
//	@Override
//	public void savedetailsofbrain(BrainPatient patientsdetails) {
//		System.out.println(patientsdetails.getId());
//		Session currentsession = entitymanager.unwrap(Session.class);
//		currentsession.saveOrUpdate(patientsdetails);
//		System.out.println("ID after save ::" + patientsdetails.getId());
//
//
//	}
//
//	@Override
//	public void savedetailsoflegs(LegsPatient patientsdetails) {
//		System.out.println(patientsdetails.getId());
//		Session currentsession = entitymanager.unwrap(Session.class);
//		currentsession.saveOrUpdate(patientsdetails);
//
//	}

	@Override
	public void savedoctorpatient(Patientsdetails patientsdetails) {
		// TODO Auto-generated method stub

	}

	@Override
	public void savedetailsofheart(HeartPatient patientsdetails) {
		// TODO Auto-generated method stub

	}

	@Override
	public void savedetailsofbrain(BrainPatient patientsdetails) {
		// TODO Auto-generated method stub

	}

	@Override
	public void savedetailsoflegs(LegsPatient patientsdetails) {
		// TODO Auto-generated method stub

	}

}
