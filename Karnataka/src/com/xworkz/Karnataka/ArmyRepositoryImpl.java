package com.xworkz.Karnataka;

public class ArmyRepositoryImpl implements ArmyRepository{
	private String[] name=new String[TOTAL_ARMYS];
	private int index=0;

	public void save(String ArmyName) {
		System.out.println("Invoking name in ArmyRepositoryimpl Class  with name method");
		
		if(index<TOTAL_ARMYS) {
			System.out.println("Value of index at starting:" +index);
			System.out.println("Army Name is:"+ArmyName);
	  this.name[index]=ArmyName;
		index=index+1;
		System.out.println("Value of index after updating:" +index);
		}
		else
		{
			System.err.println("Index Limit Exceeded,cannot save more name");
		}
	}
	public void display() {
	for(int i=0;i<TOTAL_ARMYS;i++) {
		System.out.println("Army Name at Index "+ i +" is "+name[i]);
	}


	}
}
