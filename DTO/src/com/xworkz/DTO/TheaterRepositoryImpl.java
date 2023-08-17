package com.xworkz.DTO;

public class TheaterRepositoryImpl implements TheaterRepository {

	private TheaterDTO[] theatres = new TheaterDTO[TOTAL_THEATER];
	private int index=0;
	

	@Override
	public void save(TheaterDTO theatre) {
		System.out.println("invoking TheatreRepositoryImpl..");
		if(index<TOTAL_THEATER) {
			this.theatres[index]=theatre;
			System.out.println("index "+index+ " theatre "+theatre);
			index++;
			System.out.println("index now "+index);
		}
		else {
			System.err.println("there is no space to store");
		}
		
	}


}
