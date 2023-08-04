package com.xworkz.Equals.app;

public class AssetRunner {

	public static void main(String[] args) {
		 
			System.out.println("Invoking main invoking in Asset runner");
			Assets asset=new Assets(12,"puma",3);
			System.out.println(asset);
			Assets  asset1=new Assets(12000,"chima",3);
			System.out.println(asset1);
			
	        boolean same=asset.equals(asset1);
	        System.out.println("Both Assets is Same"+same);
			
		}
	}


