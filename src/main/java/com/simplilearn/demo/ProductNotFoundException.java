package com.simplilearn.demo;

public class ProductNotFoundException extends Exception {// created an exception
	
	private static final long serialVersionUID = 1L;

	public ProductNotFoundException(String msg) {
		super(msg);
	}

	@Override
	public String toString() {//to string without inherited methods
		return "ProductNotFoundException [Not Found with ID 0]";
	}
	

}
