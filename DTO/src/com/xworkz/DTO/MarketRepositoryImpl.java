package com.xworkz.DTO;

public class MarketRepositoryImpl implements MarketRepository{
private MarketDTO[] marketdto1=new MarketDTO[NO_OF_MARKETS];
private int index;
@Override
public void save(MarketDTO marketdto) {
	System.out.println("invoking marketDTOImpl..");
	
	if(index<NO_OF_MARKETS) {
		this.marketdto1[index]=marketdto;
		System.out.println("index "+ index +" customer "+marketdto);
		index=index+1;
		System.out.println("index now :"+index);
	}
	else {
		System.out.println("there is no space to store..");
	}
	
}

	
}


