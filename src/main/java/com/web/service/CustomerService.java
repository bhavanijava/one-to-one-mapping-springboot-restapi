package com.web.service;

import java.util.List;

import com.web.exception1.CustomerNotFoundException;
import com.web.model.Customer;

public interface CustomerService {

	public Customer save(Customer c);
	public List<Customer> findAllCustomers();
	public Customer getOne(Integer id) throws CustomerNotFoundException;
}
