package com.xworkz.Drink;

public interface SetDosa extends PlainDosa {
	public default void streetFood () {
		System.out.println("Invoking streetFood In SetDosa");

}
	@Override
	  public default void hotelDosa() {
			System.out.println("Invoking In MasalaDosa");

			
}
}
