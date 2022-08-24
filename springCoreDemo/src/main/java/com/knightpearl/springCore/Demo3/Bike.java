package com.knightpearl.springCore.Demo3;

import org.springframework.beans.factory.annotation.Value;

public class Bike {

	@Value("Bullet_1000CC")
	private String name;
	
	@Value("Red")
	private String color;
	
	@Value("350000")
	private double price;

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

}
