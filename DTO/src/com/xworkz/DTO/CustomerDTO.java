package com.xworkz.DTO;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	private String name;
	private String email;
	private String gender;
	private int age;
	public CustomerDTO() {
		
	}
	public CustomerDTO(String name, String email, String gender, int age) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.age=age;	}
	@Override
	public String toString() {
		return "CustomerDTO [name=" + name + ", email=" + email + ", gender=" + gender + ", Age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	


}
