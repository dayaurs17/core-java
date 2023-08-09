package com.xworkz.Abstraction1.runner;

import com.xworkz.Abstraction1.EpsonCompany;
import com.xworkz.Abstraction1.HumanKidney;
import com.xworkz.Abstraction1.KentoPurifier1;
import com.xworkz.Abstraction1.Kidney;
import com.xworkz.Abstraction1.Printing;
import com.xworkz.Abstraction1.PrintingMachine;
import com.xworkz.Abstraction1.Sachin;
import com.xworkz.Abstraction1.Vijay;
import com.xworkz.Abstraction1.WaterPurifier;

public class PurifierRunner {

	public static void main(String[] args) {
		System.out.println("Running main in water purifier runner\n");
		WaterPurifier purifier=new KentoPurifier1();
		
		Sachin sachin=new Sachin();
		sachin.getPurify();
		
		System.out.println("Running main in water printing machine\n");
		PrintingMachine machine =new Printing();
		machine.print();
		
		EpsonCompany EC=new EpsonCompany(machine);
		EC.getPrint();
		
		System.out.println("Running main in Kidney\n");
		Kidney kidney=new HumanKidney();
		kidney.clean();
		
        Vijay vk=new Vijay(kidney);
		vk.getClean();
		

	}

}
