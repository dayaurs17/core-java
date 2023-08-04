package com.xworkz.prime.app;

public class Finance {
	public Finance(){
		System.out.println("Implicit toString");
	}
	@Override
	public String toString() {
		System.out.println("Explicit toString");
		return "Finance";
	}

}
