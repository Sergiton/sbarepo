package com.sba.customer.service;

import java.util.List;

import com.sba.customer.model.Customer;

public interface CustomerService {
	
	List<Customer> getAllCustomers();
	void addCustomer(Customer cust);

}
