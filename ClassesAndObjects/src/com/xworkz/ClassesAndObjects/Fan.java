package com.xworkz.ClassesAndObjects;

public class Fan {
	String color;
	String brand;
	int Blades;
	int price;
	int size;

	public void rotateBlades(){
		System.out.println("Fan Has Rotating Blades");
	}
	public int givesAir() {
		System.out.println("Rotating Fan Gives Air Outside");
		return 0;
	}
	public void reduceTemperature() {
		System.out.println("Fan reduces Temperature");
	}
}
