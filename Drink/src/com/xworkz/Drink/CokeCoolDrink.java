package com.xworkz.Drink;

public interface CokeCoolDrink extends PepsiCoolDrink {
	public default void caffiene() {
		System.out.println("Invoking Caffiene method in cokecooldrink");
	}
	public default void cool() {
		System.out.println("Invoking cool from cool drink in pepsidrink");
	}
}
