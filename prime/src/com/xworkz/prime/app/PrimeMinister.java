package com.xworkz.prime.app;

public class PrimeMinister {
	public PrimeMinister(){
		System.out.println("Implicit toString");
	}
	@Override
	public String toString() {
		System.out.println("Explicit toString");
		return "PrimeMinister";
	}

}
