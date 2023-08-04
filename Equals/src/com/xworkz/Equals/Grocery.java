package com.xworkz.Equals;

public class Grocery {
private double price;
private int quantity;

public Grocery(double price, int quantity) {
	super();
	this.price = price;
	this.quantity = quantity;
	System.out.println("Invoking Grocery in args constructer");
	
}


public Grocery(){
	System.out.println("Invoking Grocery in no args constructer");
}
 

@Override
public String toString() {
	return "price=" + price + ", quantity=" + quantity ;
}
public double getPrice() {
	return price;
}
public int getQuantity() {
	return quantity;
}
@Override
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
	Grocery casted =(Grocery)obj;
	
	if(this.price==casted.price &&this.quantity==casted.quantity ) {
		System.out.println("Both are Same");
		return true;
	}
	else
	{
		System.out.println("Both are not same");
	
	}	return false;
	}
	
	
	
}




