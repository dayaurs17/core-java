package com.xworkz.ClassesAndObjects;

public class Phone {
	String color;
	String brand;
	int memory;
	int price;
	int size;

	public void Call(){
		System.out.println("Call can be done using phone");
	}
	public int canRecord() {
		System.out.println("Phone can record both audio and video");
		return 0;
	}
	public void canStore() {
		System.out.println("Every Phone Can Store audio,video,pictures and all other memory ");
	}
}
