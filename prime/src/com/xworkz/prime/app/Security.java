package com.xworkz.prime.app;

public class Security {
	public Security(){
		System.out.println("Implicit toString");
	}
	@Override
	public String toString() {
		System.out.println("Explicit toString");
		return "Security";
	}

}
