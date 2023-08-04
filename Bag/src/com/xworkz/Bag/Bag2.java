package com.xworkz.Bag;

public abstract class Bag2 extends Bag1 {
	public  void transportation() {
		System.out.println("Bag is used for transportation(overriding abstract method in Bag2)");
	}
	public void hidingImpItems() {
		System.out.println("Bag is used for hidingImpItems(overriding abstract method in Bag2)");
	}
	public  abstract void protection();
}
