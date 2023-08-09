package com.xworkz.Abstraction1;

public class Vijay {
	private Kidney kidney;
	public Vijay(Kidney kidney) {
		this.kidney =kidney;
		
	}
	public void getClean() {
		if(kidney!=null) {
			System.out.println("kidney is not null");
		}
		else
		{
			System.out.println("kidney is null");
		}
	}
}
