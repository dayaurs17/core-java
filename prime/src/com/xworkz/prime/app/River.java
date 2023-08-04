package com.xworkz.prime.app;

public class River {
	public River(){
		System.out.println("Implicit toString");
	}
	@Override
	public String toString() {
		System.out.println("Explicit toString");
		return "River";
	}
}
