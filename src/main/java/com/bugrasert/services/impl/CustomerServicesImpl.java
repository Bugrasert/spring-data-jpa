package com.bugrasert.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugrasert.dto.DtoAdress;
import com.bugrasert.dto.DtoCustomer;
import com.bugrasert.entites.Address;
import com.bugrasert.entites.Customer;
import com.bugrasert.repository.CustomerRepository;
import com.bugrasert.services.ICustomerService;

@Service
public class CustomerServicesImpl implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public DtoCustomer findCustomerById(Long id) {

		DtoCustomer dtoCustomer = new DtoCustomer();
		DtoAdress dtoAddress = new DtoAdress();

		Optional<Customer> optional = customerRepository.findById(id);
		if (optional.isEmpty()) {
			return null;
		}

		Customer customer = optional.get();
		Address address = optional.get().getAddress();
		
		BeanUtils.copyProperties(customer, dtoCustomer);
		BeanUtils.copyProperties(address, dtoAddress);
		
		dtoCustomer.setAdress(dtoAddress);
		
		return dtoCustomer;
	}

}
