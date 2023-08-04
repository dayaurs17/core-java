package com.xworkz.village.outer;
import com.xworkz.village.inner.Village;
public class NewVillage extends Village {
	public NewVillage() {
		System.out.println("invoking newvillage in village");
	}
	
	@Override
	public void exit() {
			System.out.println("overriding enter in Village");
		}

}
