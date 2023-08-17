package com.xworkz.DTO;

public class MarketRunner {

	public static void main(String[] args) {
	  MarketDTO marketdto=new MarketDTO("Mysuru","Devraj",100000,300,"Homogeneous");
	  MarketDTO marketdto1=new MarketDTO("Mysuru","Mandi",200000,400,"Heterogeneous");
	  MarketDTO marketdto2=new MarketDTO("Mysuru","KRMarket",800000,500,"Homogeneous");
	  MarketDTO marketdto3=new MarketDTO("Bengaluru","KRMarket",900000,800,"Heterogeneous");
	  MarketDTO marketdto4=new MarketDTO("Mandya","Mandya",300000,100,"Heterogeneous");
	  System.out.println(marketdto);
	  System.out.println(marketdto1);
	  System.out.println(marketdto2);
	  System.out.println(marketdto3);
	  System.out.println(marketdto4);
	  MarketRepository market=new MarketRepositoryImpl();
	  market.save(marketdto);
	  market.save(marketdto1);
	  market.save(marketdto2);
	  market.save(marketdto3);
	  market.save(marketdto4);
	  
	  
	}

}
