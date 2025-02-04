package com.bugrasert.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bugrasert.controller.IAddressController;
import com.bugrasert.dto.DtoAdress;
import com.bugrasert.services.IAddressService;


@RestController
@RequestMapping("/rest/api/address")
public class AddressControllerImpl implements IAddressController{
	
	@Autowired
	private IAddressService addressService;

	@GetMapping(path = "/list/{id}")
	@Override
	public DtoAdress findAddressById(@PathVariable(name ="id") Long id) {
		return addressService.findAddressById(id);
	}

}
