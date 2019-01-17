package com.lti.vehicle.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.vehicle.dao.IApplicationInsuranceDao;
import com.lti.vehicle.model.ApplicationInsurance;

public class ApplicationServiceImpl implements IApplicationInsuranceService{
	
	@Autowired
private IApplicationInsuranceDao iApplicationInsuranceDao;
	
	public void setiApplicationInsuranceDao(IApplicationInsuranceDao iApplicationInsuranceDao) {
		this.iApplicationInsuranceDao = iApplicationInsuranceDao;
	}



	@Override
	public double calculatePremium(ApplicationInsurance applicationInsurance) {
		// TODO Auto-generated method stub
		
		return this.iApplicationInsuranceDao.calculatePremium(applicationInsurance);
	
	}
}
