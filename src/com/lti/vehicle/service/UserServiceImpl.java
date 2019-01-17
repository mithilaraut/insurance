package com.lti.vehicle.service;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

import com.lti.vehicle.dao.UserDao;
import com.lti.vehicle.model.UserDetails;

	@Service
	@Transactional
	public class UserServiceImpl implements UserService{
		
		
			private UserDao userDao;
		//setter method for personDao
			@Autowired
			public void setUserDao(UserDao userDao) {
				this.userDao = userDao;
			}
			@Override
			@Transactional
			public void addUser(UserDetails u) {
				this.userDao.addUser(u);
			}

		
		  @Override public boolean verifyUser(String username, String password) {
		  return userDao.verifyUser(username, password);
		  
		  }
		 
			@Override
			public String getByEmail(String email) {
				 
				return this.getByEmail(email);
			}
	}


