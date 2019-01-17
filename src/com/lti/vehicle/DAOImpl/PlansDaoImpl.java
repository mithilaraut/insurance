package com.lti.vehicle.DAOImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lti.vehicle.dao.PlansDao;
import com.lti.vehicle.model.Plans;



@Transactional
public class PlansDaoImpl implements PlansDao{
	private static final Logger logger = 			
			LoggerFactory.getLogger(VehicleDaoImpl.class);
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void addPlan(Plans p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(p);
		logger.info("Plan Details saved="+ p);
		tx.commit();		
	}
	

}
