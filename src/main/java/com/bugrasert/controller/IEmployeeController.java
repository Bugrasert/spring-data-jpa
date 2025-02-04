package com.bugrasert.controller;

import java.util.List;

import com.bugrasert.dto.DtoEmployee;

public interface IEmployeeController {
	
	public List<DtoEmployee> findAllEmployees();

}
