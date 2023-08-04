package com.xworkz.Equals.app;
import com.xworkz.Equals.Grocery;

public class GroceryRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main invoking in Grocer runner");
		Grocery grocery=new Grocery(12000,3);
		System.out.println(grocery);
		Grocery grocery1=new Grocery(12000,3);
		System.out.println(grocery1);
		
        boolean same=grocery.equals(grocery1);
        System.out.println("Both Grocery is Same"+same);
		
		
		
		
		
		
		
		

	}

}
