package com.bugrasert.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugrasert.dto.DtoAdress;
import com.bugrasert.dto.DtoCustomer;
import com.bugrasert.entites.Address;
import com.bugrasert.repository.AddressRepository;
import com.bugrasert.services.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService{
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public DtoAdress findAddressById(Long id) {
		DtoAdress dtoAddress = new DtoAdress();
		Optional<Address> optional= addressRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		Address address = optional.get();
		BeanUtils.copyProperties(address, dtoAddress);
		
		DtoCustomer dtoCustomer= new DtoCustomer();
		dtoCustomer.setId(address.getCustomer().getId());
		dtoCustomer.setName(address.getCustomer().getName());
		
//		dtoCustomer.setAdress(dtoAddress);
		
		dtoAddress.setCustomer(dtoCustomer);
		return dtoAddress;
			
	}

	
}
