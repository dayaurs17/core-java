package com.xworkz.Rule;

public interface TempleRules {
	static int priceForEntry=30;
	int openingTime=12;
	public static void providingFood() {
		System.out.println("Temple is used for providingFood with price:"+priceForEntry);
	}
	static void praying() {
		System.out.println("Temple is used to spend time generally used for praying within opening time:"+openingTime);
	}
}
