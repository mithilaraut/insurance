package com.lti.vehicle.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.vehicle.dao.PlansDao;
import com.lti.vehicle.model.Plans;


public class PlanServiceImpl implements IPlanService{


	@Autowired
	private PlansDao planDao;

	public void setPlanDao(PlansDao planDao) {
		this.planDao = planDao;
	}
	public PlansDao getPlanDao() {
		return planDao;
	}
	
	@Override
	public void addPlan(Plans p) {

		this.planDao.addPlan(p);
		
		
	}



}
