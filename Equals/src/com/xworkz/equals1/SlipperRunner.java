package com.xworkz.equals1;

public class SlipperRunner {

	public static void main(String[] args) {
		System.out.println("Running of main of Slipper");
		Slipper slipper=new Slipper(1000,"crox",12,1,1,"Puma","Viratkohli");
		System.out.println(slipper);
		Slipper slipper1=new Slipper(1000,"crox",12,1,1,"Puma","Viratkohli");
		System.out.println(slipper1);
		Boolean same=slipper.equals(slipper1);
		System.out.println("Both Vehicles are Same"+same);

	}

}
