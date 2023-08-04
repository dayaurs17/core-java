package com.xworkz.Car;

public abstract class Car1 {
	
public final void canRun() {
	System.out.println("calling final method canRun method in car1 class");
}
public void consumeDiesel() {
	System.out.println("calling normal method consumeDiesel in car1");
	
}
public  abstract void budget();
public abstract int milage();
	

}
