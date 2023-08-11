package com.xworkz.Karnataka;

public class OlympicYearImpl implements OlympicYear {
	private String[] name=new String[TOTAL_OLYMPICSS];
	private int index=0;

	public void save(String OlympicName) {
		System.out.println("Invoking name in OlympicYearClass  with name method");
		
		if(index<TOTAL_OLYMPICSS) {
			System.out.println("Value of index at starting:" +index);
			System.out.println("Politician Name is:"+OlympicName);
	  this.name[index]=OlympicName;
		index=index+1;
		System.out.println("Value of index after updating:" +index);
		}
		else
		{
			System.err.println("Index Limit Exceeded,cannot save more name");
		}
	}
	public void display() {
	for(int i=0;i<TOTAL_OLYMPICSS;i++) {
		System.out.println("Olympic Name at Index "+ i +" is "+name[i]);
	}


	}
}
