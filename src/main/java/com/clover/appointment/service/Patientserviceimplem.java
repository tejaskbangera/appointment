package com.clover.appointment.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clover.appointment.bean.Patientsdetailsbean;
import com.clover.appointment.dao.patientdetaildao;
import com.clover.appointment.entity.BrainPatient;
import com.clover.appointment.entity.HeartPatient;
import com.clover.appointment.entity.LegsPatient;
import com.clover.appointment.entity.Patientsdetails;
import com.clover.appointment.entity.Registration;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class Patientserviceimplem implements Patientservice{

	
	@Autowired
	private patientdetaildao patientdao;
	
	@Override
	@Transactional
	public void save(Patientsdetailsbean employeeobj) {
		int a=employeeobj.getDoctorid();
//		 ObjectMapper mapper = new ObjectMapper();
//         Patientsdetails patientsdetails= mapper.convertValue(employeeobj, Patientsdetails.class);
		Patientsdetails patientsdetails=new Patientsdetails();
		patientsdetails.setId(employeeobj.getId());
		patientsdetails.setFirstname(employeeobj.getFirstname());
		patientsdetails.setLastname(employeeobj.getLastname());
		patientsdetails.setDate(employeeobj.getDate());
		patientsdetails.setAge(employeeobj.getAge());
		patientsdetails.setDisease(employeeobj.getDisease());
		patientsdetails.setTreatmentbefore(employeeobj.getTreatmentbefore());
		patientsdetails.setTreatmentfor(employeeobj.getTreatmentfor());
		patientsdetails.setPeriod(employeeobj.getPeriod());
		patientsdetails.setSufferringfrom(employeeobj.getSufferringfrom());
		
         System.out.println(">>>" + patientsdetails.toString());
	patientdao.savedetails(patientsdetails,a);
	
		 
	}

	@Override
	public void save1(HeartPatient employeeobj) {
		 ObjectMapper mapper = new ObjectMapper();
		 HeartPatient patientsdetails= mapper.convertValue(employeeobj, HeartPatient.class);
         System.out.println(">>>" + patientsdetails.toString());
	patientdao.savedetailsofheart(patientsdetails);
	
		
	}

	@Override
	public void save2(BrainPatient employeeobj) {
		 ObjectMapper mapper = new ObjectMapper();
		 BrainPatient patientsdetails= mapper.convertValue(employeeobj, BrainPatient.class);
         System.out.println(">>>" + patientsdetails.toString());
	patientdao.savedetailsofbrain(patientsdetails);
		
	}

	@Override
	public void save3(LegsPatient employeeobj) {
		 ObjectMapper mapper = new ObjectMapper();
		 LegsPatient patientsdetails= mapper.convertValue(employeeobj, LegsPatient.class);
         System.out.println(">>>" + patientsdetails.toString());
	patientdao.savedetailsoflegs(patientsdetails);
		
	}

	
	
}