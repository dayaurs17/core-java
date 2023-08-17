package com.xworkz.DTO;

import com.xworkz.DTO.CustomerDTO;

public interface CustomerRepository  {
	int TOTAL_CUSTOMER=5;
	
	void save(CustomerDTO customerDto);
	
}
