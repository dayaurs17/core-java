package com.xworkz.DTO;

public class PilotRepositoryImpl implements PilotRepository {
	private PilotDTO[] markets = new PilotDTO[TOTAL_PILOTS];
	private int index=0;
	
	@Override
	public void save(PilotDTO pilot) {
		System.out.println("invoking PoiletRepositoryImpl");
		if(index<TOTAL_PILOTS) {
			this.markets[index]=pilot;
			System.out.println("index :"+index+" market :"+pilot);
			index++;
			System.out.println("index "+index);
		}
		else {
			System.err.println("no space to store");
		}

}

}
