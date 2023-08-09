package com.xworkz.Drink;

public class BTMCoolDrink implements CoolDrink,PepsiCoolDrink,CokeCoolDrink{
	@Override
	public void cool() {
		System.out.println("Invoking cool from cool drink in BTMCoolDrink");
	}
	@Override
	public  void swag() {
		System.out.println("Invoking swag method in BTMCoolDrink");
	}
	@Override
	public  void caffiene() {
		System.out.println("Invoking Caffiene method in BTMCoolDrink");
	}
}
