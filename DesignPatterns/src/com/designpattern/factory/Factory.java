package com.designpattern.factory;

public class Factory {

	public Shape getShapeInstance(String shape) {

		if (shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		}

		if (shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}
}
