package com.xworkz.DTO;

public class MarketDTO {
private String location;
private String name;
private int price;
private int noOfVendors;
private String commodity;
public MarketDTO() {
	super();
	
}
public MarketDTO(String location, String name, int price, int noOfVendors, String commodity) {
	super();
	this.location = location;
	this.name = name;
	this.price = price;
	this.noOfVendors = noOfVendors;
	this.commodity = commodity;
}
@Override
public String toString() {
	return "MarketDTO [location=" + location + ", name=" + name + ", price=" + price + ", noOfVendors=" + noOfVendors
			+ ", commodity=" + commodity + "]";
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getNoOfVendors() {
	return noOfVendors;
}
public void setNoOfVendors(int noOfVendors) {
	this.noOfVendors = noOfVendors;
}
public String getCommodity() {
	return commodity;
}
public void setCommodity(String commodity) {
	this.commodity = commodity;
}



}
