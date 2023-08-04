package com.xworkz.Rule;

public interface CompanyRules {
	static int people=200;
	long salary=1000000;
	public static void Discipline() {
		System.out.println("company maintains Discipline among for about:"+people);
	}
	static void providesSalary() {
		System.out.println("Comapany used to provide Salary"+salary);
	}
}
