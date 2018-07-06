package com.javaSession.creational.three.builder;

public class LunchOrderBeanDemo {

	public static void main(String[] args) {

		LunchOrderBean lunchOrderBean = new LunchOrderBean();

		// we can comment out the setter and it will still print the LunchOrderBean
		// object
		// It also dose not provide any contract that how the object should look like.
		
		
		lunchOrderBean.setBread("Wheat");
		lunchOrderBean.setCondiments("Lettuce");
		// lunchOrderBean.setDressing("Mustard");
		// lunchOrderBean.setMeat("Ham");

		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());
		System.out.println(lunchOrderBean.getDressing());
		System.out.println(lunchOrderBean.getMeat());

	}

}
