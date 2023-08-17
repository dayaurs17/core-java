package com.xworkz.DTO;

public class PilotRunner {

	public static void main(String[] args) {
		PilotDTO pilotDTO = new PilotDTO("navya", "mumbai", "kumar", "madhu", false);
		PilotDTO pilotDTO1 = new PilotDTO("baveena", "lucknow", "vanish", "madhura", false);
		PilotDTO pilotDTO2 = new PilotDTO("chahar", "bengaluru", "bhuvan", "sneha", false);
		PilotDTO pilotDTO3 = new PilotDTO("charu", "chennai", "madu", "veda", false);
		PilotDTO pilotDTO4 = new PilotDTO("bhoomika", "hyderabad", "gagan", "vani", false);
		System.out.println(pilotDTO);
		System.out.println(pilotDTO1);
		System.out.println(pilotDTO2);
		System.out.println(pilotDTO3);
		System.out.println(pilotDTO4);
		
		
		PilotRepository pilotRepository = new PilotRepositoryImpl();
		pilotRepository.save(pilotDTO);
		pilotRepository.save(pilotDTO1);
		pilotRepository.save(pilotDTO2);
		pilotRepository.save(pilotDTO3);
		pilotRepository.save(pilotDTO4);
		

	}

}
