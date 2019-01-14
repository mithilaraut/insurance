package com.vehicle.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.dao.IUserDao;
import com.vehicle.model.User;

	@Service
	@Transactional
	public class UserServiceImpl implements IUserService {

		@Autowired
		IUserDao userDao;
		
		@Override
		public List fetchPassword(String userName) {
			
			return userDao.fetchPassword(userName);
		}

		@Override
		public void AddUser(User user) {
		userDao.AddUser(user);
			
		}

		@Override
		public boolean verifyUser(String userName, String password) {
			return userDao.verifyUser(userName, password);
		}		
	}

