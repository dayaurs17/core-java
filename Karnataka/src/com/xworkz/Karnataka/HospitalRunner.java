package com.xworkz.Karnataka;

public class HospitalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running main in HospitalRunner");
        HospitalRepository ref=new  HospitalRepositoryImpl();
        ref.save("Manipal Hospital");
        ref.save("Government Hospital");
        ref.save("ESI Hospital");
        ref.save("Narayana Hospital");
        ref.save("Jayadeva Hospital");
        
        System.out.println("**************************");
        ref.display();
	}

}
