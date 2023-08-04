package com.xworkz.equals1;


public class Gold {
	
private int price;
private String quality;
private double quantity;
private String brand;
public Gold(int price, String quality, double quantity, String brand) {
	super();
	this.price = price;
	this.quality = quality;
	this.quantity = quantity;
	this.brand = brand;
}
public Gold() {
	super();
}
@Override
public String toString() {
	return "Gold [price=" + price + ", quality=" + quality + ", quantity=" + quantity + ", brand=" + brand + "]";
}
public int getPrice() {
	return price;
}
public String getQuality() {
	return quality;
}
public double getQunatity() {
	return quantity;
}
public String getBrand() {
	return brand;
}
public boolean equals(Object obj) {
	System.out.println("Invoking equals in gold");
	if(obj!=null) {
		System.out.println("arg is not null,can compare ");
	}else
	{
		System.err.println("arg is null");		
	}
	if(obj instanceof Gold) {
		System.out.println("obj is instance of gold");
	}
	else
	{
		System.err.println("obj is not an instance of gold");
	}
	System.out.println(this);
	System.out.println(obj);
	Gold casted =(Gold)obj;
	
	if(this.price==casted.price &&this.quantity==casted.quantity && this.brand==casted.brand && this.quality==casted.quality) {
		System.out.println("Both are Same");
		return true;
	}
	else
	{
		System.out.println("Both are not same");
	
	}	return false;
}
}


