package com.bugrasert.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoEmployee {
	
	private Long id;
	
	private String name;
	
	private DtoDepartment department;

}
