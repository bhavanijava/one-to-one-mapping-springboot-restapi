package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.exception1.CustomerNotFoundException;
import com.web.model.Customer;
import com.web.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("/save")
	public Customer save(@RequestBody Customer cd)
	{
		return service.save(cd);
	}
	
	@GetMapping("/findAll")
	public List<Customer> findAllCustomers()
	{
		return service.findAllCustomers();
	}
	@GetMapping("/findOne/{id}")
	public Customer findOne(@PathVariable Integer id) throws CustomerNotFoundException
	{
		return service.getOne(id);
	}
}
