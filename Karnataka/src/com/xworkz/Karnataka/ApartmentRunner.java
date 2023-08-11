package com.xworkz.Karnataka;
import com.xworkz.Karnataka.ApartmentRepositoryImpl;
public class ApartmentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running main in Apartment Runner");
        ApartmentRepository ref=new ApartmentRepositoryImpl();
        ref.save("Enclave Apartment");
        ref.save("Modern Apartment");
        ref.save("Luxe Loft Apartment");
        ref.save("Velvet Apartment");
        ref.save("Celestrial Apartment");
        
        System.out.println("**************************");
        ref.display();
        
	}

}
