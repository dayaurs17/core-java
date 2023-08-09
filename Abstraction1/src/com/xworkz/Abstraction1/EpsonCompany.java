package com.xworkz.Abstraction1;

public class EpsonCompany {
private PrintingMachine machine;
public EpsonCompany(PrintingMachine machine) {
	this.machine =machine;
	
}
public void getPrint() {
	if(machine!=null) {
		System.out.println("machine is not null");
	}
	else
	{
		System.out.println("machine is null");
	}
}
}
