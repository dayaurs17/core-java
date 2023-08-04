package com.xworkz.Rule;

public interface Airport {
	static int price=3000;
	int PeoplesInAeroplane=60;
	public static void travelling() {
		System.out.println("Airport is used for travelling with price:"+price);
	}
	static void speed() {
		System.out.println("using Airport One can travel soon with range of people about  :"+PeoplesInAeroplane);
	}
}
