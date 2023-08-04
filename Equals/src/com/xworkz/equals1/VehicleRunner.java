package com.xworkz.equals1;
import com.xworkz.equals1.Vehicle;
public class VehicleRunner {

	public static void main(String[] args) {
		System.out.println("Running of main of Vehicle");
		Vehicle vehicle=new Vehicle(100000,"Green","Kawazaki",18.5,"Bike");
		System.out.println(vehicle);
		Vehicle vehicle1=new Vehicle(100000,"Yellow","Lamborgini",8.7,"Car");
		System.out.println(vehicle1);
		Boolean same=vehicle.equals(vehicle1);
		System.out.println("Both Vehicles are Same"+same);
	}

}
