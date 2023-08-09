package com.xworkz.Abstraction1;

public class Sachin extends KentoPurifier1{
private WaterPurifier purifier;
public void KentoPurify( WaterPurifier purifier) {
	this.purifier=purifier;
}
public void getPurify() {
	if(purifier!=null) {
		System.out.println("Purify is not null");
		this.purifier.purify();
	}
	else
	{
		System.out.println("Purify is null,cannot purify");
	}
}
}
