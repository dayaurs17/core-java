package com.xworkz.equals1;

public class Slipper {
	private int price;
	private String name;
	private int quantity;
	private int quality;
	private int type;
	private String brand;
	private String ambassadar;
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
	public String getAmbassadar() {
		return ambassadar;
	}
	@Override
	public String toString() {
		return "Slipper [price=" + price + ", name=" + name + ", quantity=" + quantity + ", quality=" + quality
				+ ", type=" + type + ", brand=" + brand + ", ambassadar=" + ambassadar + "]";
	}
	public Slipper(int price, String name, int quantity, int quality, int type, String brand, String ambassadar) {
		super();
		this.price = price;
		this.name = name;
		this.quantity = quantity;
		this.quality = quality;
		this.type = type;
		this.brand = brand;
		this.ambassadar = ambassadar;
	}
	public Slipper() {
		super();
		
	}
	
	public boolean equals(Object obj) {
		System.out.println("Invoking equals in Slipper");
		if(obj!=null) {
			System.out.println("Obj is not null");
		}
		else
		{
			System.out.println("Obj is not null");
		}
		if(obj instanceof Slipper) {
			System.out.println("Obj is instance Of slipper");
		}
		else
		{
			System.out.println("Obj is not instance of slipper");
		}
		System.out.println(this);
		System.out.println(obj);
		Slipper casted=(Slipper)obj;
		if(this.price==casted.price &&this.quantity==casted.quantity && this.brand==casted.brand && this.quality==casted.quality && this.type==casted.type &&this.name==casted.name && this.ambassadar==casted.ambassadar ) {
			System.out.println("Both are Same");
			return true;
		}
		else
		{
			System.out.println("Both are not same");
		
		}	return false;
		
		}
		
	}


