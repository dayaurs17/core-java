package com.xworkz.Karnataka;

public class PoliticalClass implements PoliticalInterface {

private String[] name=new String[TOTAL_MEMBERS];
private int index=0;

public void name(String PoliticianName) {
	System.out.println("Invoking name in politicalClass with name method");
	
	if(index<TOTAL_MEMBERS) {
		System.out.println("Value of index at starting:" +index);
		System.out.println("Politician Name is:"+PoliticianName);
  this.name[index]=PoliticianName;
	index=index+1;
	System.out.println("Value of index after updating:" +index);
	}
	else
	{
		System.err.println("Index Limit Exceeded,cannot save more name");
	}
}
public void display() {
for(int i=0;i<TOTAL_MEMBERS;i++) {
	System.out.println("Politician Name at Index "+ i +" is "+name[i]);
}


}
}