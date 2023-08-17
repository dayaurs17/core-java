package com.xworkz.DTO;

public class CustomerRunner {

	public static void main(String[] args) {
		
		
		
		
		CustomerDTO customerDTO = new CustomerDTO("Abhay","Abhay@gmail.com","Male",21);
		CustomerDTO customerDTO1 = new CustomerDTO("Vijay","Vijay@gmail.com","Male",21);
		CustomerDTO customerDTO2 = new CustomerDTO("Ajay","Ajay@gmail.com","Male",21);
		CustomerDTO customerDTO3 = new CustomerDTO("Sujay","Sujay@gmail.com","Male",21);
		CustomerDTO customerDTO4 = new CustomerDTO("Abhi","Abhi@gmail.com","Male",21);
		System.out.println(customerDTO);
		System.out.println(customerDTO1);
		System.out.println(customerDTO2);
		System.out.println(customerDTO3);
		System.out.println(customerDTO4);
		
		CustomerRepository customerRepository = new CustomerRepositoryImpl();
		customerRepository.save(customerDTO);
		customerRepository.save(customerDTO1);
		customerRepository.save(customerDTO2);
		customerRepository.save(customerDTO3);
		customerRepository.save(customerDTO4);
		


	}

}
