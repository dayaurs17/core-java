package com.xworkz.Drink;

public class Laptop implements DellLaptop,AppleLaptop {
	public void managable() {
		 System.out.println("Invoking Managable in Laptop");
	}
	 @Override
	public void durable() {
		System.out.println("Invoking durable in Laptop");
	}
	 @Override
	public void expensive() {
		 System.out.println("Invoking expensive in Laptop");
	}
}
