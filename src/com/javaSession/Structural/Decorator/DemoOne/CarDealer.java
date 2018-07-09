package com.javaSession.Structural.Decorator.DemoOne;

public class CarDealer {
	public static void main(String[] args) {
		
		Car buggati = new SportsCar();
		Car musicSystem = new MusicSystem(buggati);
		Car bumperStricker = new BumperSticker(musicSystem, "RED");
		
		System.out.println("Car information = " + bumperStricker.getDetails() + ", cost " + bumperStricker.calculateCost());
		
		
		
	}

}
