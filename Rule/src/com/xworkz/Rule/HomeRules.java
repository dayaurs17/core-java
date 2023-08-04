package com.xworkz.Rule;

public interface HomeRules {
	static int people=4;
	int sizeOfSiteInSqFt=2000;
	public static void Resting() {
		System.out.println("Home is used for Resting  with sizeOfSiteInSqFt:"+sizeOfSiteInSqFt);
	}
	static void followRules() {
		System.out.println("Home Rules are made by father we must follow+ :"+people);
	}
}
