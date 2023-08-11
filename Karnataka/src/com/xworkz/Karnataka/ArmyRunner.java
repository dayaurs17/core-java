package com.xworkz.Karnataka;

public class ArmyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running main in Army Runner");
        ArmyRepository ref=new ArmyRepositoryImpl();
        ref.save("Admiral Army");
        ref.save("Sergeant Army");
        ref.save("Major Army");
        ref.save("Scout Army");
        ref.save("Commodore Army");
        
        System.out.println("**************************");
        ref.display();
	}

}
