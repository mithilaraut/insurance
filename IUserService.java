package com.vehicle.service;

import java.util.List;

import com.vehicle.model.User;

public interface IUserService {
	List fetchPassword(String userName);

	void AddUser(User user);
		boolean verifyUser(String userName,String password);
		
	}


