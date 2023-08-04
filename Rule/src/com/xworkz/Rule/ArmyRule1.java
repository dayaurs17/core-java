package com.xworkz.Rule;

public class ArmyRule1 implements ArmyRule,SaloonRules,HospitalRules{

	@Override
	public void discipline() {
		// TODO Auto-generated method stub
		System.out.println("Invoking overrided discipline for "+totalMembers);
	}

	@Override
	public void treatment() {
		// TODO Auto-generated method stub
		System.out.println("Invoking overrided treatment for Army class");
	}
	 

}
