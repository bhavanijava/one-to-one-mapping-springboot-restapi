package com.web.AddressController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Address;
import com.web.service.address.AddressService;

@RestController
public class AddressController {

	@Autowired
	private AddressService aservice;
	
	@GetMapping("/address")
	public List<Address> findAllDetailsa()
	{
		return aservice.findAllAddresses();
	}
}
