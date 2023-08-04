package com.xworkz.prime.app;

public class President {
	public President(){
		System.out.println("Implicit toString");
	}
	@Override
	public String toString() {
		System.out.println("Explicit toString");
		return "President";
	}
}
