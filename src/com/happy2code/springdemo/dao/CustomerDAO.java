package com.happy2code.springdemo.dao;

import java.util.List;


import com.happy2code.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
}
