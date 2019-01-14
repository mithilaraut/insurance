package com.vehicle.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicle.model.User;

	@Repository
	public class UserDaoImpl  implements IUserDao {
	 static Transaction tcx ;
	private SessionFactory sessionFactory;
		
	@Autowired // if annotated as repository then dont need to put entries in .xml
	public void setSessionFactory(SessionFactory sf) {
	    this.sessionFactory = sf;
	}

		@Override
		public List fetchPassword(String userName) {
			Session session = this.sessionFactory.openSession();
			  tcx = session.beginTransaction();
			Query q=  session.createQuery("from registration where userName=:userName");
			 q.setString("userName", userName);
		       List l=q.list();
		l.get(6);
		tcx.commit();
		       session.close();
		       return l;
		       
		}

		@Override
		public void AddUser(User user) {
		
	        Session session = this.sessionFactory.openSession();
	        tcx = session.beginTransaction();
	       session.save(user);
	        tcx.commit();
	        session.close();
			
		}

		@Override
		public boolean verifyUser(String userName, String password) {
			Session session = this.sessionFactory.openSession();
			 
	   
			  String query="From User a where a.userName=:userName and a.password=:password";
			  
			  Query q=session.createQuery(query);
			  q.setString("userName", userName);
			  q.setString("password", password);
			  List<User> l=q.list();
			  
	  if(l.size()==0)
	  {
		  return false;
	  }
	  session.close();
		  return true;

	   
	}

	}

