package com.bugrasert.controller;

import com.bugrasert.dto.DtoCustomer;

public interface ICustomerController {
	
	public DtoCustomer findCustomerById(Long id);

}
