package com.xworkz.Abstraction1;

public interface KentoPurifier  extends WaterPurifier{
default boolean filter() {
	System.out.println("invoking filter in kentpurifier");
	return false;
}
default void purify() {
	System.out.println("Invoking purify in Kentpurifier ");
}
}
