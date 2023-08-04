package com.xworkz.equals1;

public class Vehicle {
private int price;
private String color;
private String brand;
private double milage;
private String typeOf;
public Vehicle(int price, String color, String brand, double milage, String typeOf) {
	super();
	this.price = price;
	this.color = color;
	this.brand = brand;
	this.milage = milage;
	this.typeOf = typeOf;
}
public Vehicle() {
	super();
}
public void setPrice(int price) {
	this.price = price;
}
public void setColor(String color) {
	this.color = color;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public void setMilage(double milage) {
	this.milage = milage;
}
public void setTypeOf(String typeOf) {
	this.typeOf = typeOf;
}
@Override
public String toString() {
	return "Vehicle [price=" + price + ", color=" + color + ", brand=" + brand + ", milage=" + milage + ", typeOf="
			+ typeOf + "]";
}

public boolean equals(Object obj) {
	System.out.println("Invoking equals in Vehicle");
	if(obj!=null) {
		System.out.println("arg is not null,can compare ");
	}else
	{
		System.err.println("arg is null");		
	}
	if(obj instanceof Vehicle) {
		System.out.println("obj is instance of Vehicle");
	}
	else
	{
		System.err.println("obj is not an instance of Vehicle");
	}
	System.out.println(this);
	System.out.println(obj);
	Vehicle casted =(Vehicle)obj;
	
	if(this.price==casted.price &&this.color==casted.color && this.brand==casted.brand && this.milage==casted.milage&&  this.typeOf==casted.typeOf) {
		System.out.println("Both are Same");
		return true;
	}
	else
	{
		System.out.println("Both are not same");
	
	}	return false;
}

}
