package com.xworkz.Rule;

public interface SaloonRules {
int price=30;
static String name="Saloon";
static void glowUp() {
	System.out.println("Invoking saloon in ArmyRule1 name:"+name);
}
public static void priceForEachHairCut() {
	System.out.println("Invoking priceForEachHairCut saloon price: "+price);
}

}
