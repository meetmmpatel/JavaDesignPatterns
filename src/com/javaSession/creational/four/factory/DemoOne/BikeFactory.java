package com.javaSession.creational.four.factory.DemoOne;

public class BikeFactory extends VehicleFactory {
	 
	@Override
	public Vehicle createVehicle() {
		return new Bike();
	}
 
}
