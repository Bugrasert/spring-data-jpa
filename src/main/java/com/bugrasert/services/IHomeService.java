package com.bugrasert.services;

import com.bugrasert.dto.DtoHome;

public interface IHomeService {
	
	public DtoHome findHomeById(Long id);
}
