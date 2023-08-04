package com.xworkz.Mobile;

public abstract class Mobile2 extends Mobile1 {
	public  void gaming() {
		System.out.println("Mobile is used for gaming(overriding abstract method in Mobile2)");
	}
	public void playingVideo() {
		System.out.println("Mobile is used for playingVideo(overriding abstract method in Mobile2)");
	}
	public  abstract void wifi();

}
