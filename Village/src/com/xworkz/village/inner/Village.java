package com.xworkz.village.inner;

public class Village {
	public Village() {
		System.out.println("invoking no arg cons of village");
	}
	
	public void enter() {
		System.out.println("invoking enter in Village");
	}
	
	protected void exit() {
		System.out.println("invoking exit in Village");
	}
}
