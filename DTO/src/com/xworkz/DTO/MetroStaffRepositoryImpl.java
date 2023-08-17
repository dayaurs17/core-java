package com.xworkz.DTO;

public class MetroStaffRepositoryImpl implements MetroStaffRepository {

	private MetroStaff[] staff = new MetroStaff[TOTAL_STAFF];
	private int index=0;
	@Override
	public void save(MetroStaff metroStaff) {
		System.out.println("invoking MetroStaffRepositoryImpl");
		if(index<TOTAL_STAFF) {
			this.staff[index]=metroStaff;
			System.out.println("index "+index+" metroStaff "+ staff[index]);
			index++;
			System.out.println("index after :"+index);
		}
		
	}

}
