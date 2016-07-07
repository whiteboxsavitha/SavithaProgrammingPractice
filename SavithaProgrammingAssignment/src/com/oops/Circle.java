package com.oops;

public class Circle extends Shape implements ShapeConstants{
	

	public Circle(double noofSides) {
		super();
		this.noofSides = noofSides;
	}

	private double radius;
	
	
	public double noofSides;

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return super.calculateArea();
	}


	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		super.calculatePerimeter();
	}


	@Override
	public void setSides() {
		// TODO Auto-generated method stub
		super.setSides();
	}
	
}