package com.xworkz.prime.app;

public class Lotus {
	public Lotus(){
		System.out.println("Implicit toString");
	}
	@Override
	public String toString() {
		System.out.println("Explicit toString");
		return "Lotus";
	}
}
