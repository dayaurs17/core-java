package com.xworkz.equals1;

public class DryFruit {
	private int price;
	private String name;
	private int quantity;
	private int quality;
	private int type;
	private String brand;
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getQuality() {
		return quality;
	}
	public int getType() {
		return type;
	}
	public String getBrand() {
		return brand;
	}
	@Override
	public String toString() {
		return "DryFruit [price=" + price + ", name=" + name + ", quantity=" + quantity + ", quality=" + quality
				+ ", type=" + type + ", brand=" + brand + "]";
	}
	public DryFruit(int price, String name, int quantity, int quality, int type, String brand) {
		super();
		this.price = price;
		this.name = name;
		this.quantity = quantity;
		this.quality = quality;
		this.type = type;
		this.brand = brand;
	}
	public DryFruit() {
		super();
	}
	public boolean equals(Object obj) {
		System.out.println("Invoking equals in DryFruit");
		if(obj!=null) {
			System.out.println("arg is not null,can compare ");
		}else
		{
			System.err.println("arg is null");		
		}
		if(obj instanceof DryFruit) {
			System.out.println("obj is instance of DryFruit");
		}
		else
		{
			System.err.println("obj is not an instance of DryFruit");
		}
		System.out.println(this);
		System.out.println(obj);
		DryFruit casted =(DryFruit)obj;
		
		if(this.price==casted.price &&this.quantity==casted.quantity && this.brand==casted.brand && this.quality==casted.quality && this.type==casted.type && this.name==casted.name) {
			System.out.println("Both are Same");
			return true;
		}
		else
		{
			System.out.println("Both are not same");
		
		}	return false;
	}
	

}
