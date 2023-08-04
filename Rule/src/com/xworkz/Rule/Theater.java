package com.xworkz.Rule;

public interface Theater {
	static int people=60;
	int price=100;
	public static void resting() {
		System.out.println("Home is used for Resting  for about:"+people);
	}
	static void watchingMovie() {
		System.out.println("Theater is used for watchingMovie with price for each movie:"+price);
	}
}
