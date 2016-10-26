package com.happy2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.happy2code.springdemo.entity.Customer;

@Repository
public class CustpmerDAOImpl implements CustomerDAO {
	//Need to inject the session Factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// Get thr current Session
		Session currentSession = sessionFactory.getCurrentSession();
		//create a query
		Query<Customer> theQuery = currentSession.createQuery("from Customer",Customer.class);
		//execute query and get lis
		List<Customer> customers = theQuery.getResultList();
		// return the results
		return customers;
	}

}
