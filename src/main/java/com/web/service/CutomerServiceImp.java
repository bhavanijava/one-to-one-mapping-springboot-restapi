package com.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.exception1.CustomerNotFoundException;
import com.web.model.Customer;
import com.web.repo.CustomerRepo;

@Service
public class CutomerServiceImp implements CustomerService {
	@Autowired
	private CustomerRepo crepo;
	
	
	
	@Override
	public Customer save(Customer c) {
		return crepo.save(c);
	}



	@Override
	public List<Customer> findAllCustomers() {
		return crepo.findAll();
	}



	@Override
	public Customer getOne(Integer id) throws CustomerNotFoundException {
		Optional<Customer> found=crepo.findById(id);
		if(found.isPresent())
		{
			return found.get();
		}
		else{
			throw new CustomerNotFoundException("In this Customer Id "+id+" does not exit");
		}
	}
	
	

}
