package com.xworkz.DTO;

public class MetroStaffRunner {

	public static void main(String[] args) {
		MetroStaff metroStaffDTO = new MetroStaff(1, 24, "bhavya", "jallahalii ", 30000);
		MetroStaff metroStaffDTO1 = new MetroStaff(2, 36, "Navya", "electronic city ", 50000);
		MetroStaff metroStaffDTO2 = new MetroStaff(3, 41, "bahani", "banashankari ", 34000);
		MetroStaff metroStaffDTO3 = new MetroStaff(13, 54, "karunya", "majestic ", 307000);
		MetroStaff metroStaffDTO4 = new MetroStaff(17, 74, "shiva", "8mile ", 90000);
		System.out.println(metroStaffDTO);
		System.out.println(metroStaffDTO1);
		System.out.println(metroStaffDTO2);
		System.out.println(metroStaffDTO3);
		System.out.println(metroStaffDTO4);
		
		MetroStaffRepository metroStaffRepository=new MetroStaffRepositoryImpl();
		metroStaffRepository.save(metroStaffDTO);
		metroStaffRepository.save(metroStaffDTO1);
		metroStaffRepository.save(metroStaffDTO2);
		metroStaffRepository.save(metroStaffDTO3);
		metroStaffRepository.save(metroStaffDTO4);

	}

}
