package com.lti.vehicle.model;


public class VehicleAttribute {
	
	private String vehicleType;
	private String vehicleBrand;
	private String vehicleModel;
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	@Override
	public String toString() {
		return "VehicleAttribute [vehicleType=" + vehicleType + ", vehicleBrand=" + vehicleBrand + ", vehicleModel="
				+ vehicleModel + "]";
	}
	public VehicleAttribute(String vehicleType, String vehicleBrand, String vehicleModel) {
		super();
		
	}
	
	
	
}
