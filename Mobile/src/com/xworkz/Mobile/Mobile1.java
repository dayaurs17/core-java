package com.xworkz.Mobile;

public abstract class Mobile1 {
	
	public final void calling() {
		System.out.println("Mobile is used for calling(final method)");
	}
	public void messaging() {
		System.out.println("Mobile is used for Messaging(normal method)");
	}
	public abstract void gaming();
	public abstract void playingVideo();

}
