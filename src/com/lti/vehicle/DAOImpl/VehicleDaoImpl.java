package com.lti.vehicle.DAOImpl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lti.vehicle.dao.VehicleDao;
import com.lti.vehicle.model.VehicleDetails;


@Transactional
//@Repository
public class VehicleDaoImpl implements VehicleDao {
	private static final Logger logger = 			
			LoggerFactory.getLogger(VehicleDaoImpl.class);

	private SessionFactory sessionFactory;


	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}


	@Override
	public void addVehicle(VehicleDetails v) {
			Session session = this.sessionFactory.openSession();
			Transaction tx= session.beginTransaction();
			session.save(v);
			logger.info("Vehicle Details added successfully, Vehicle Details="+ v);
			tx.commit();
		}
		
				

	}


	

