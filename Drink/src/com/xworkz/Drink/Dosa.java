package com.xworkz.Drink;

public class Dosa implements MasalaDosa,PlainDosa,SetDosa{
	  @Override
			public void hotelDosa() {
				 System.out.println("Invoking MasalaDosa in Cheese");
			}
			 @Override
			public void homeDosa() {
				System.out.println("Invoking PlainDosa in Cheese");
			}
			 @Override
			public void streetFood() {
				 System.out.println("Invoking SetDosa in Cheese");
			}
}
