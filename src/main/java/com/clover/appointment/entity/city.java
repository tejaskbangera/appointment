
package com.clover.appointment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "city")
@XmlRootElement
public class city {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cityid;
	private String city_name;
	
	 @JoinColumn(name = "stateid", referencedColumnName = "stateid")
	    @ManyToOne(optional = false)
	private state stateid;

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public state getStateid() {
		return stateid;
	}

	public void setStateid(state stateid) {
		this.stateid = stateid;
	}

	@Override
	public String toString() {
		return "city [cityid=" + cityid + ", city_name=" + city_name + ", stateid=" + stateid + "]";
	}

	
	
}
