package com.xworkz.DTO;

public class CustomerRepositoryImpl implements CustomerRepository {

	
	
	private  CustomerDTO[] customerdto=new CustomerDTO[TOTAL_CUSTOMER];
	private int index=0;
	
	@Override
	public void save(CustomerDTO customerDto) {
		
		System.out.println("invoking CustomerDTOImpl..");
		
		if(index<TOTAL_CUSTOMER) {
			this.customerdto[index]=customerDto;
			System.out.println("index "+ index +" customer "+customerDto);
			index=index+1;
			System.out.println("index now :"+index);
		}
		else {
			System.out.println("there is no space to store..");
		}
		
	}
	


	}
	

