package com.xworkz.ClassesAndObjects;

public class Laptop {
	String color;
	String brand;
	int memory;
	int price;
	int size;

	public void canDisplay(){
		System.out.println("Display can be seen in Laptop");
	}
	public int canRecord() {
		System.out.println("laptop can record both audio and video");
		return 0;
	}
	public void canStore() {
		System.out.println("Every Laptop Can Store audio,video,pictures and all other memory ");
	}
}
