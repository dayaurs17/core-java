package com.xworkz.Drink;

public interface DellLaptop extends LenovoLaptop {
	public default void  durable () {
		System.out.println("Invoking durable in dell laptop");
	
	

}
	@Override
	public default void managable() {
		System.out.println("Invoking Managable from lenovo in dell laptop ");

		
	}
}
