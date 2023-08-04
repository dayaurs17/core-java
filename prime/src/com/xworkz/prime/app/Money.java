package com.xworkz.prime.app;

public class Money {
	public Money(){
		System.out.println("Implicit toString");
	}
	@Override
	public String toString() {
		System.out.println("Explicit toString");
		return "Money";
	}
}
