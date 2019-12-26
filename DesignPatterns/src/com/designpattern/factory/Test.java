package com.designpattern.factory;

public class Test {

	public static void main(String[] args) {

		Factory factory = new Factory();
		Shape shape = factory.getShapeInstance("Circle");
		shape.getShape();

		Shape shape2 = factory.getShapeInstance("Rectangle");
		shape2.getShape();

	}

}
