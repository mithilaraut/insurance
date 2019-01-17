package com.lti.vehicle.service;

	import org.springframework.stereotype.Service;

import com.lti.vehicle.model.UserDetails;
	@Service
	public interface UserService {
		

			public void addUser(UserDetails u);
		boolean verifyUser(String username, String password);
			public String getByEmail(String email);
			
	}
