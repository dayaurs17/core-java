package com.xworkz.DTO;

public class TheaterRunner {

	public static void main(String[] args) {
		TheaterDTO theatreDTO = new TheaterDTO("SBG",150, "KGF","Bengaluru", 7);
		TheaterDTO theatreDTO1 = new TheaterDTO("sayadri", 300, "googly","Bengaluru", 7);
		TheaterDTO theatreDTO2 = new TheaterDTO("bhanu", 500, "KGF 2","Bengaluru", 7);
		TheaterDTO theatreDTO3 = new TheaterDTO("guru",700, "kantahra","Bengaluru", 7);
		TheaterDTO theatreDTO4 = new TheaterDTO("orion",1000, "HHB","Bengaluru", 7);
		System.out.println(theatreDTO);
		System.out.println(theatreDTO1);
		System.out.println(theatreDTO2);
		System.out.println(theatreDTO3);
		System.out.println(theatreDTO4);
		
		TheaterRepository theatreRepository=new TheaterRepositoryImpl();
		theatreRepository.save(theatreDTO);
		theatreRepository.save(theatreDTO1);
		theatreRepository.save(theatreDTO2);
		theatreRepository.save(theatreDTO3);
		theatreRepository.save(theatreDTO4);

	}

}
