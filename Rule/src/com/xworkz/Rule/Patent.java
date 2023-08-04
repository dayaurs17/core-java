package com.xworkz.Rule;

public interface Patent {
	static String product="name";
	int price=100;
	public static void innovation() {
		System.out.println("patent is used for innovation so no other company have same character:"+product);
	}
	static void resarch() {
		System.out.println("Paten is used for resarch done under price:"+price);
	}
}
