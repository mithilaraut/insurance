package com.vehicle.dao;

import java.util.List;

import com.vehicle.model.User;

public interface IUserDao {
public List fetchPassword(String userName);
	
	public void AddUser(User user);
	
	boolean verifyUser(String userName,String password);
}

