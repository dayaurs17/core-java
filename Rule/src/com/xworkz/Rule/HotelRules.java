package com.xworkz.Rule;

public interface HotelRules {
	static int fullMealPrice=300;
	int Branches=2;
	public static void providingFood() {
		System.out.println("Hotel is used for providingFood with price:"+fullMealPrice);
	}
	static void spendTime() {
		System.out.println("Hotel is used to spend time as it has many branches :"+Branches);
	}
}
