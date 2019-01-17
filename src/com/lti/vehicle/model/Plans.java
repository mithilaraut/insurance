package com.lti.vehicle.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="plans")
public class Plans {
	
	@OneToOne(mappedBy="plans", cascade = CascadeType.ALL)
	private VehicleDetails vehicleDetails;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="plan_seq")
	@SequenceGenerator(name="plan_seq", sequenceName="plan_seq")
	private Integer planId;
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="plan_seq"
	private String planType;
	
	private int planYear;
	
	
	public int getPlanYear() {
		return planYear;
	}
	public void setPlanYear(int planYear) {
		this.planYear = planYear;
	}
	
	
	
	@Override
	public String toString() {
		return "Plans [vehicleDetails=" + vehicleDetails + ", planId=" + planId + ", planType=" + planType
				+ ", planYear=" + planYear + "]";
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public Plans() {
		super();
	
	}

	

}
