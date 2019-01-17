package com.lti.vehicle.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ApplicationInsurance")
public class ApplicationInsurance {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="application_seq")
	@SequenceGenerator(name="application_seq", sequenceName="application_seq")
		private Integer applicationId;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	private VehicleDetails tempVehicle;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Plans tempPlan;

	
	
	
	
	
	public ApplicationInsurance() {
		super();
 
	}

	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public VehicleDetails getTempVehicle() {
		return tempVehicle;
	}

	public void setTempVehicle(VehicleDetails tempVehicle) {
		this.tempVehicle = tempVehicle;
	}

	public Plans getTempPlan() {
		return tempPlan;
	}

	public void setTempPlan(Plans tempPlan) {
		this.tempPlan = tempPlan;
	}
	
	

}
