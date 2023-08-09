package com.xworkz.Drink;

public class InterfaceRunner {

	public static void main(String[] args) {
		BTMCoolDrink btmCoolDrink = new BTMCoolDrink();
		btmCoolDrink.cool();
		btmCoolDrink.caffiene();
		btmCoolDrink.swag();
		
		PepsiCoolDrink  ps = new BTMCoolDrink();
		ps.cool();
		ps.swag();
		
		CokeCoolDrink cd = new BTMCoolDrink();
		cd.cool();
		cd.caffiene();
		
		CoolDrink cool = new BTMCoolDrink();
		cool.cool();
		
		System.out.println("________________________________________");
		Dosa Dosa = new Dosa();
		Dosa.hotelDosa();
		Dosa.homeDosa();
		Dosa.streetFood();
		
		PlainDosa pd =new Dosa();
		pd.hotelDosa();
		pd.homeDosa();
		SetDosa sd = new Dosa();
		sd.hotelDosa();
		sd.streetFood();
	
		MasalaDosa md = new Dosa();
		md.hotelDosa();
		
		System.out.println("________________________________________");
		Laptop laptop = new Laptop();
		laptop.managable();
		laptop.durable();
		laptop.expensive();
		
		AppleLaptop apple = new Laptop();
		
		apple.expensive();
		apple.managable();
	    DellLaptop dell= new Laptop();
		dell.managable();
		dell.durable();
		LenovoLaptop lenovo=new Laptop();
		lenovo.managable();

	}

}
