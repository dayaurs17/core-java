package com.xworkz.Karnataka;

public class HospitalRepositoryImpl implements HospitalRepository{
	private String[] name=new String[TOTAL_HOSPITALS];
	private int index=0;

	public void save(String HospitalName) {
		System.out.println("Invoking name in HospitalRepositoryimpl Class  with name method");
		
		if(index<TOTAL_HOSPITALS) {
			System.out.println("Value of index at starting:" +index);
			System.out.println("Hospital Name is:"+HospitalName);
	  this.name[index]=HospitalName;
		index=index+1;
		System.out.println("Value of index after updating:" +index);
		}
		else
		{
			System.err.println("Index Limit Exceeded,cannot save more name");
		}
	}
	public void display() {
	for(int i=0;i<TOTAL_HOSPITALS;i++) {
		System.out.println("Hospital Name at Index "+ i +" is "+name[i]);
	}


	}
}
