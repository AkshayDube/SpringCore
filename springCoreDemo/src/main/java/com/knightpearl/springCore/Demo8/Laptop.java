package com.knightpearl.springCore.Demo8;

public class Laptop {

	private Harddisk harddisk1;
	
	private String laptop_name;
	
	private double price;

	public Harddisk getHarddisk1() {
		return harddisk1;
	}

	public String getLaptop_name() {
		return laptop_name;
	}

	public double getPrice() {
		return price;
	}

	public Laptop(Harddisk harddisk1, String laptop_name, double price) {
		super();
		this.harddisk1 = harddisk1;
		this.laptop_name = laptop_name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [harddisk=" + harddisk1 + ", laptop_name=" + laptop_name + ", price=" + price + "]";
	}
	
	
}
