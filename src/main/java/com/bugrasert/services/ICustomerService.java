package com.bugrasert.services;

import com.bugrasert.dto.DtoCustomer;

public interface ICustomerService {
	
	public DtoCustomer findCustomerById(Long id);

}
