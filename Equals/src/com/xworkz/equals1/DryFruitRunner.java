package com.xworkz.equals1;

public class DryFruitRunner {

	public static void main(String[] args) {
		System.out.println("Running of main of Vehicle");
		DryFruit dryFruit=new DryFruit(1000,"Badam",120,1,1,"HappiloDryFruit");
		System.out.println(dryFruit);
		DryFruit dryFruit1=new DryFruit(1000,"Badam",120,1,1,"HappiloDryFruit");
		System.out.println(dryFruit1);
		Boolean same=dryFruit.equals(dryFruit1);
		System.out.println("Both Vehicles are Same"+same);

	}

}
