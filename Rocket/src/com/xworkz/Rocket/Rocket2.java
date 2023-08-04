package com.xworkz.Rocket;

public abstract class Rocket2 extends Rocket1 {
	public  void weatherForeCast() {
		System.out.println("Rocket is used for weatherforecast details(overriding abstract method in Rocket2)");
	}
	public void gps() {
		System.out.println("Mobile is used for playingVideo(overriding abstract method in Rocket2)");
	}
	public  abstract void exploreSolarSystem();

}
