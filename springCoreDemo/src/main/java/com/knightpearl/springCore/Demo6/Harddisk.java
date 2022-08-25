package com.knightpearl.springCore.Demo6;

public class Harddisk {

	private String name;
	
	private int size;
	
	private String type;

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public String getType() {
		return type;
	}

	public Harddisk(String name, int size, String type) {
		super();
		this.name = name;
		this.size = size;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Harddisk [name=" + name + ", size=" + size + ", type=" + type + "]";
	}

	
	
	
}
