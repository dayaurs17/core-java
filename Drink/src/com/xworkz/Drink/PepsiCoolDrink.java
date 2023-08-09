package com.xworkz.Drink;

public interface PepsiCoolDrink extends CoolDrink {
public default void swag() {
	System.out.println("Invoking swag method in pepsidrink");
}

@Override
public default void cool() {
	System.out.println("Invoking cool from cool drink in pepsidrink");
}
}
