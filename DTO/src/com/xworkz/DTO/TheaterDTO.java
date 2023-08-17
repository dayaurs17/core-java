package com.xworkz.DTO;

import java.io.Serializable;

public class TheaterDTO implements Serializable{
	private String name;
	private int price;
	private String movie;
	private String location;
	private int id;
	public TheaterDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TheaterDTO(String name, int price, String movie, String location, int id) {
		super();
		this.name = name;
		this.price = price;
		this.movie = movie;
		this.location = location;
		this.id = id;
	}
	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", price=" + price + ", movie=" + movie + ", location=" + location + ", id="
				+ id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
