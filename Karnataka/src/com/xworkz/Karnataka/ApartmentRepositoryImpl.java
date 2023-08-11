package com.xworkz.Karnataka;

public class ApartmentRepositoryImpl implements ApartmentRepository {
	private String[] name=new String[TOTAL_APARTMENTS];
	private int index=0;

	public void save(String ApartmentName) {
		System.out.println("Invoking name in Apartmentnameimpl Class  with name method");
		
		if(index<TOTAL_APARTMENTS) {
			System.out.println("Value of index at starting:" +index);
			System.out.println("Apartment Name is:"+ApartmentName);
	  this.name[index]=ApartmentName;
		index=index+1;
		System.out.println("Value of index after updating:" +index);
		}
		else
		{
			System.err.println("Index Limit Exceeded,cannot save more name");
		}
	}
	public void display() {
	for(int i=0;i<TOTAL_APARTMENTS;i++) {
		System.out.println("Apartment Name at Index "+ i +" is "+name[i]);
	}


	}
}
