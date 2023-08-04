package com.xworkz.Enum1;

public enum Gender {
MALE(1.00),FEMALE(2.00),OTHERS(0.00);
	double value;
	public Gender(double value)
	{
		this.value=value;
	}
}
