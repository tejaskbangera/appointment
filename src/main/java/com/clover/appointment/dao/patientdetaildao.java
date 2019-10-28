
package com.clover.appointment.dao;

import com.clover.appointment.bean.Patientsdetailsbean;
import com.clover.appointment.entity.BrainPatient;
import com.clover.appointment.entity.HeartPatient;
import com.clover.appointment.entity.LegsPatient;
import com.clover.appointment.entity.Patientsdetails;

public interface patientdetaildao {

	public void savedetails(Patientsdetails employeeobj, int a);

	public void savedetailsofheart(HeartPatient patientsdetails);

	public void savedetailsofbrain(BrainPatient patientsdetails);

	public void savedetailsoflegs(LegsPatient patientsdetails);

	public void savedoctorpatient(Patientsdetails patientsdetails);

}
