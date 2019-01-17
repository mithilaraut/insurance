package com.lti.vehicle.DAOImpl;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.transaction.annotation.Transactional;

import com.lti.vehicle.dao.IApplicationInsuranceDao;
import com.lti.vehicle.model.ApplicationInsurance;

	@Transactional
	public class ApplicationInsuranceImpl implements IApplicationInsuranceDao{
		
		private static final Logger logger = 			
				LoggerFactory.getLogger(VehicleDaoImpl.class);
		private SessionFactory sessionFactory;
		
		@Autowired
		public void setSessionFactory(SessionFactory sf) {
			this.sessionFactory = sf;
		}
		
		
		double idv;
		double premium;
		double tax;
		double totalPremium;
		int currentYear=2019;
		int currentMonth=1;
		
		
		@Override
		public double calculatePremium(ApplicationInsurance applicationInsurance) {
			// TODO Auto-generated method stub
			Session session = this.sessionFactory.openSession();
			Transaction tx= session.beginTransaction();

			String brandName=applicationInsurance.getTempVehicle().getModel();
			int pyear=applicationInsurance.getTempPlan().getPlanYear();
		
					System.out.println(brandName);
					if(brandName.equals("Baleno"))
					{
							double costPrice=700000;
							int month=applicationInsurance.getTempVehicle().getPurchaseMonth();
							int year=applicationInsurance.getTempVehicle().getPurchaseYear();
							double diff=(((year*12)+month)-((currentYear*12)+currentMonth));
					System.out.println("Difference in years: " +diff);
					
							idv=costPrice-(costPrice*(4/100));
					System.out.println("Calculated value of idv:  " +idv);
						if(pyear==1)
								{
								premium=idv*0.017;  //1year premium
									}
					else if(pyear==2) 
								{
								premium=idv*0.016;  //2years premium
								}
					else if(pyear==3)
								{
								premium=idv*(0.015);  //3years premium
								}	
						System.out.println("Premium calculated as per given data :" +premium );
					}
					
				tax=premium*(0.18);   //0.18 tax as per government rules(2018)
				System.out.println("Tax applied" +tax);
				
				totalPremium=premium+tax;  //total premium calculation
				System.out.println("Total premium you need to pay" +totalPremium);
				
				//session.save(applicationInsurance);
				logger.info("Objects saved successful="+ applicationInsurance);
				tx.commit();
							
				return totalPremium;	
	} 
	}


