package com.xworkz.Rule;

public interface ArmyRule {
	final int MorningWakeup=4;
	int totalMembers=100;
	
	public abstract void discipline();
	public static void earlyMorning() {
		System.out.println("Invoking earlyMorning at "+MorningWakeup);
	}
	

}
