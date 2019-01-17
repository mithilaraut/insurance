package com.lti.vehicle.dao;

import com.lti.vehicle.model.ApplicationInsurance;

public interface IApplicationInsuranceDao {

	public double calculatePremium(ApplicationInsurance applicationInsurance);
}
