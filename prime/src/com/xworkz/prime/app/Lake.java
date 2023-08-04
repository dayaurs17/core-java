package com.xworkz.prime.app;

public class Lake {
	public Lake(){
		System.out.println("Implicit toString");
	}
	@Override
	public String toString() {
		System.out.println("Explicit toString");
		return "Lake";
	}
}
