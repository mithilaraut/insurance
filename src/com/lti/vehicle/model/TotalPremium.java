package com.lti.vehicle.model;
public class TotalPremium {
	
	private String brandName;
	private int month;
	private int year;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "TotalPremium [brandName=" + brandName + ", month=" + month + ", year=" + year + "]";
	}
	public TotalPremium() {
		super();
	
	}
	public TotalPremium(String brandName, int month, int year) {
		super();
		this.brandName = brandName;
		this.month = month;
		this.year = year;
	}
	
	
	

}
