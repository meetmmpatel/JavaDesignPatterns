package com.javaSession.Behavioral.Strategy.demoOne;

public class Rider {
	
	public static void main(String[] args) {
		Bike bike = new Bike();
		//bike.rideBike();
		//You can set the CarefulRiging or RashRiding based on client needs
		bike.setRidingStyle(new RashRiding());
		bike.rideBike();
		
		
		
		
	}

}
