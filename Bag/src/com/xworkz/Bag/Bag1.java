package com.xworkz.Bag;

public abstract class Bag1 {
	public final void carrying() {
		System.out.println("Bag is used for carrying(final method)");
	}
	public void storing() {
		System.out.println("Bag is used for Storing(normal method)");
	}
	public abstract void transportation();
	public abstract void hidingImpItems();
}
