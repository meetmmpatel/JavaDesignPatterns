package com.javaSession.creational.three.builder;

public class LunchOrderBean {

	private String bread;
	private String condiments;
	private String dressing;
	private String meat;

	//by using no argument constructor we are also not forcing what LunchOrderBean object should look like.
	//Consumer of this class can choose any variable to create LunchOrderBean object.
	public LunchOrderBean() {

	}

	
	//Getters and Setter are really not immutable  since we can change to value with setter anytime.
	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public void setCondiments(String condiments) {
		this.condiments = condiments;
	}

	public void setDressing(String dressing) {
		this.dressing = dressing;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

}
