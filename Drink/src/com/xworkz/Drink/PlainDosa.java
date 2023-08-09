package com.xworkz.Drink;

public interface PlainDosa extends MasalaDosa{
	public default void homeDosa () {
		System.out.println("Invoking  homedosa In Plaindosa");

		
	}
  @Override
  public default void hotelDosa() {
		System.out.println("Invoking hotelDosa from MasalaDosa in plaindosa");

		

}
}
