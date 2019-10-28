package com.clover.appointment.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author adms.java1
 */
@Entity
@Table(name = "doctorpatient")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doctorpatient.findAll", query = "SELECT d FROM Doctorpatient d"),
    @NamedQuery(name = "Doctorpatient.findById", query = "SELECT d FROM Doctorpatient d WHERE d.id = :id"),
    @NamedQuery(name = "Doctorpatient.findBySpecification", query = "SELECT d FROM Doctorpatient d WHERE d.specification = :specification")})
public class Doctorpatient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "specification")
    private String specification;
    @JoinColumn(name = "patientid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Patientsdetails patientid;
    @JoinColumn(name = "doctorid", referencedColumnName = "userid")
    @ManyToOne(optional = false)
    private Adminregistration doctorid;

    public Doctorpatient() {
    }

    public Doctorpatient(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Patientsdetails getPatientid() {
        return patientid;
    }

    public void setPatientid(Patientsdetails patientid) {
        this.patientid = patientid;
    }

   

    public Adminregistration getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(Adminregistration doctorid) {
		this.doctorid = doctorid;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doctorpatient)) {
            return false;
        }
        Doctorpatient other = (Doctorpatient) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.clover.demo.entity.Doctorpatient[ id=" + id + " ]";
    }
    
}
