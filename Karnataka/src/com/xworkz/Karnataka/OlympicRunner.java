package com.xworkz.Karnataka;
import com.xworkz.Karnataka.OlympicYear;
public class OlympicRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running main in Olympic Runner");
        OlympicYear ref=new OlympicYearImpl();
        ref.save("RIO OLYMPICS");
        ref.save("BEIGING OLYMPICS");
        ref.save("TOKYO OLYMPICS");
        ref.save("SOCHI OLYMPICS");
        ref.save("LONDON OLYMPICS");
        
        System.out.println("**************************");
        ref.display();
        
	}

}
