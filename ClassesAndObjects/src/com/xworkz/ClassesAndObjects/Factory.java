package com.xworkz.ClassesAndObjects;

public class Factory {
	String name;
	int noOfEmployees;
	int noOfMachines;
	String location;
	String manufucturingProducts;
	


	public void manufucturing(){
		System.out.println("Manufacturing is done in factory");
	}
	public int employement() {
		System.out.println("Factory Gives Employement oppurtunities to Lecturers");
		return 0;
	}
	public void providesFoodInCanteen() {
		System.out.println("Factory will  providesFoodInCanteen ");
	}

}
