package com.bugrasert.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoAdress {
	
	private Long id;
	
	private String description;
	
	private DtoCustomer customer;
	
	

}
