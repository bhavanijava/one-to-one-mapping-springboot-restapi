package com.web.service.address;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Address;
import com.web.repo.AddressRepo;

@Service
public class AddressServiceImp implements AddressService {

	@Autowired
	private AddressRepo arepo;
	@Override
	public List<Address> findAllAddresses() {
		return arepo.findAll();
	}

	

}
