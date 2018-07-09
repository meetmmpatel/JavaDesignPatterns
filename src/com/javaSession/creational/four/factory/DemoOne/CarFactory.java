package com.javaSession.creational.four.factory.DemoOne;

public class CarFactory extends VehicleFactory {
	 
	@Override
	public Vehicle createVehicle() {
		return new Car();
	}
}
