package com.xworkz.Drink;

public interface AppleLaptop extends DellLaptop {
	public default void  expensive () {
		System.out.println("Invoking Expensive in Applelaptop");
	
	

}
	@Override
	public default void managable () {
		System.out.println("Invoking Managable from lenovo in Apple laptop ");

		
	}
}
