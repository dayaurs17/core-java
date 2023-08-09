package com.xworkz.Abstraction1;

public class KentoPurifier1 implements WaterPurifier {
	public boolean filter() {
		System.out.println("invoking filter in kentpurifier");
		return false;
	}
	public void purify() {
		System.out.println("Invoking purify in Kentpurifier ");
	}
}
