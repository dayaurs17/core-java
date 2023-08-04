package com.xworkz.prime.app;

public class MLA {
	public MLA(){
		System.out.println("Implicit toString");
	}
	@Override
	public String toString() {
		System.out.println("Explicit toString");
		return "MLA";
	}
}
