package com.javaSession.creational.three.builder;

public class LunchOrderTeleDemo {
	
	public static void main(String[] args) {
		
		LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Ham");
		
		LunchOrderTele lunchOrderTele1 = new LunchOrderTele("Wheat", "Lettuce", "Mustard");
		
		LunchOrderTele lunchOrderTele2 = new LunchOrderTele( "Lettuce", "Mustard");
		
		System.out.println(lunchOrderTele.getBread());
		System.out.println(lunchOrderTele.getCondiments());
		System.out.println(lunchOrderTele.getDressing());
		System.out.println(lunchOrderTele.getMeat());
		
		System.out.println(lunchOrderTele.toString());
		System.out.println(lunchOrderTele1.toString());
		System.out.println(lunchOrderTele2.toString());
	}

}
