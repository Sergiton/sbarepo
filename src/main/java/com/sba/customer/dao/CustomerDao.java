package com.sba.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sba.customer.model.Customer;


public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
