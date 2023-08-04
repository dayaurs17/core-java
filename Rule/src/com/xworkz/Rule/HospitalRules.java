package com.xworkz.Rule;

public interface HospitalRules {
static double bill=10000;
final int totalRooms=40;

public abstract void treatment() ;
	// TODO Auto-generated method stub
	

public static void operation() {
	System.out.println("Invoking operation in hospital with price="+bill);
}
}
