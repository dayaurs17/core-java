package com.xworkz.DTO;

public class PilotDTO {
	private String name;
	private String location;
	private String fatherName;
	private String motherName;
	private boolean married;
	public PilotDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PilotDTO(String name, String location, String fatherName, String motherName, boolean married) {
		super();
		this.name = name;
		this.location = location;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.married = married;
	}
	@Override
	public String toString() {
		return "PilotDTO [name=" + name + ", location=" + location + ", fatherName=" + fatherName + ", motherName="
				+ motherName + ", married=" + married + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	
}
