package com.model.gadget;

public class Product {
	int id;
	String name;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}

