package com.xworkz.prime.app;

public class Ladoo {
	public Ladoo(){
		System.out.println("Implicit toString");
	}
	@Override
	public String toString() {
		System.out.println("Explicit toString");
		return "Ladoo";
	}
}
