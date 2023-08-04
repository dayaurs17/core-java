package com.xworkz.equals1;
import com.xworkz.equals1.Gold;
public class GoldRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main invoking in Gold runner");
		Gold gold=new Gold(5500,"24charat",1.5,"Kalyan");
		System.out.println(gold);
		Gold gold1=new Gold(5500,"24charat",1.5,"Kalyan");
		System.out.println(gold1);
		
        boolean same=gold.equals(gold1);
        System.out.println("Both Assets is Same"+same);
		

	}

}
