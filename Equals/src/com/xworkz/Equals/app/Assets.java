package com.xworkz.Equals.app;

import com.xworkz.Equals.Grocery;

public class Assets {
private int price;
private String brand;
private int quantity;
@Override
public String toString() {
	return "Assets [price=" + price + ", brand=" + brand + ", quantity=" + quantity + "]";
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getBrand() {
	return brand;
}
public Assets(int price, String brand, int quantity) {
	super();
	this.price = price;
	this.brand = brand;
	this.quantity = quantity;
	System.out.println("Generating Assets Constructer with arguments");
}
public Assets() {
	super();
	System.out.println("Generating Assets Constructer with arguments");
}
public boolean equals(Object obj) {
	System.out.println("Invoking equals in Grocery");
	if(obj!=null) {
		System.out.println("arg is not,can compare ");
	}else
	{
		System.err.println("arg is null");		
	}
	if(obj instanceof Grocery) {
		System.out.println("obj is instance of grocery");
	}
	else
	{
		System.err.println("obj is not an instance of grocery");
	}
	System.out.println(this);
	System.out.println(obj);
	Assets casted =(Assets)obj;
	
	if(this.price==casted.price &&this.quantity==casted.quantity && this.brand==casted.brand ) {
		System.out.println("Both are Same");
		return true;
	}
	else
	{
		System.out.println("Both are not same");
	
	}	return false;
	}







}
