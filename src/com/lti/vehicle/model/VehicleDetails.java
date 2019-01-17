package com.lti.vehicle.model;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.executable.ValidateOnExecution;





//@Component
@Entity
@Table(name="VEHICLEDETAILS")
public class VehicleDetails implements Serializable {
	
	 @OneToOne(mappedBy = "tempVehicle", cascade = CascadeType.ALL)
	private ApplicationInsurance applicationInsurance;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="vehicleDetails_seq")
	@SequenceGenerator(name="vehicleDetails_seq", sequenceName="vehicleDetails_seq")
	private Integer vehicleId;
	 
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "planId")
	private Plans plans;
	
	
		
	@Column
	private String  vehicleType;
	@Column
	private String  brand;
	@Column
	private String model;
	@Column
	//@NotEmpty(message = " License number must be of 13 digits")
	private int license;
	//@NotEmpty(message = " Year must be in 4 digits")
	@Column
	private int purchaseMonth;
	@Column
	private int purchaseYear;
	@Column
	private int regNumber;
	@Column
	private int engineNum;
	@Column
	private int ChasisNum;
	
	
	public VehicleDetails() {
		super();
		}


	public Integer getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getLicense() {
		return license;
	}


	public void setLicense(int license) {
		this.license = license;
	}


	public int getPurchaseMonth() {
		return purchaseMonth;
	}


	public void setPurchaseMonth(int purchaseMonth) {
		this.purchaseMonth = purchaseMonth;
	}


	public int getPurchaseYear() {
		return purchaseYear;
	}


	public void setPurchaseYear(int purchaseYear) {
		this.purchaseYear = purchaseYear;
	}


	public int getRegNumber() {
		return regNumber;
	}


	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}


	public int getEngineNum() {
		return engineNum;
	}


	public void setEngineNum(int engineNum) {
		this.engineNum = engineNum;
	}


	public int getChasisNum() {
		return ChasisNum;
	}


	public void setChasisNum(int chasisNum) {
		ChasisNum = chasisNum;
	}


	@Override
	public String toString() {
		return "VehicleDetails [vehicleId=" + vehicleId + ", vehicleType=" + vehicleType + ", brand=" + brand
				+ ", model=" + model + ", license=" + license + ", purchaseMonth=" + purchaseMonth + ", purchaseYear="
				+ purchaseYear + ", regNumber=" + regNumber + ", engineNum=" + engineNum + ", ChasisNum=" + ChasisNum
				+ "]";
	}




}








