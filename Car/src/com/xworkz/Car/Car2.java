package com.xworkz.Car;

public abstract class Car2 extends Car1{
	public void budget() {
		System.out.println("Overriding abstract method budget in car2 ");
	}
	public int milage() {
		System.out.println("Overriding milage method from abstract in car2");
		return 0;
	}
	public abstract void timeReduce();

}
