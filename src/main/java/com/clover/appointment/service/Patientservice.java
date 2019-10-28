package com.clover.appointment.service;

import com.clover.appointment.bean.Patientsdetailsbean;
import com.clover.appointment.bean.RegisterBean;
import com.clover.appointment.entity.BrainPatient;
import com.clover.appointment.entity.HeartPatient;
import com.clover.appointment.entity.LegsPatient;

public interface Patientservice {

	public void save(Patientsdetailsbean employeeobj) ;

	public void save1(HeartPatient employeeobj);

	public void save2(BrainPatient employeeobj);

	public void save3(LegsPatient employeeobj);

}

