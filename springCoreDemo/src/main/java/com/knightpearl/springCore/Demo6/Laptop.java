package com.knightpearl.springCore.Demo6;

public class Laptop {

	private Harddisk harddisk;
	
	private String laptop_name;
	
	private double price;

	public Harddisk getHarddisk() {
		return harddisk;
	}

	public String getLaptop_name() {
		return laptop_name;
	}

	public double getPrice() {
		return price;
	}

	public Laptop(Harddisk harddisk, String laptop_name, double price) {
		super();
		this.harddisk = harddisk;
		this.laptop_name = laptop_name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [harddisk=" + harddisk + ", laptop_name=" + laptop_name + ", price=" + price + "]";
	}
	
	
}
