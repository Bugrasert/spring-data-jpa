package com.bugrasert.services;

import java.util.List;

import com.bugrasert.dto.DtoEmployee;

public interface IEmployeeService {
	
	public List<DtoEmployee> findAllEmployees();

}
