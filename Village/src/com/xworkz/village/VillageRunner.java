package com.xworkz.village;
import com.xworkz.village.inner.OldVillage;
import com.xworkz.village.outer.NewVillage;

public class VillageRunner {
public static void main(String[] args) {
		
		System.out.println("invoking main in Villagerunner ");
		
		OldVillage oldvillage = new OldVillage();
		oldvillage.enter();
		
		NewVillage newvillage = new NewVillage();
		newvillage.exit();
		

	}

}
