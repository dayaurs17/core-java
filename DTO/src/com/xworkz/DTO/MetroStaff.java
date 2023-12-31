package com.xworkz.DTO;

import java.io.Serializable;

public class MetroStaff implements Serializable {
private int id;
private int age;
private String name;
private String address;
private int salary;
public MetroStaff(int id, int age, String name, String address, int salary) {
	super();
	this.id = id;
	this.age = age;
	this.name = name;
	this.address = address;
	this.salary = salary;
}
public MetroStaff() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "MetroStaff [id=" + id + ", age=" + age + ", name=" + name + ", address=" + address + ", salary=" + salary
			+ "]";
}


}
