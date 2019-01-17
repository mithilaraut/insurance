package com.lti.vehicle.dao;

	import org.springframework.stereotype.Repository;

import com.lti.vehicle.model.UserDetails;
	@Repository
	public interface UserDao {

		// user related operation
//		String getByEmail(String email);
		UserDetails get(int id);

		void addUser(UserDetails u);
		boolean verifyUser(String email, String password);
		
		// adding and updating a new address
		//Address getAddress(int addressId);
//		boolean addAddress(Address address);
//		boolean updateAddress(Address address);
//		Address getBillingAddress(int userId);
//		List<Address> listShippingAddresses(int userId);
		

		
	}
