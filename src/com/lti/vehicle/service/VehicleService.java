package com.lti.vehicle.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.vehicle.dao.VehicleDao;
import com.lti.vehicle.model.VehicleDetails;

//@Service
public class VehicleService implements IVehicleService {
	@Autowired
	VehicleDao vehicleDao;


public void setVehicleDao(VehicleDao vehicleDao) {
	this.vehicleDao = vehicleDao;
}



@Override
	public void addVehicle(VehicleDetails v) {
		// TODO Auto-generated method stub
	this.vehicleDao.addVehicle(v);
	}

/*@Override
@Transactional
	public List<VehicleDetails> listVehicleDetails() {
		// TODO Auto-generated method stub
return	this.vehicleDao.listVehicleDetails();
	}*/

/*@Override
@Transactional
	public Vehicle ListVehiclebyId(int id) {
		// TODO Auto-generated method stub
		return this.vehicleDao.ListVehiclebyId(id);
	}
*/
	
}
