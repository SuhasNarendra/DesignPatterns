package com.designpattern.abstractfactory;

public class NoCornerShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		if (shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		}

		if (shape.equalsIgnoreCase("Elipse")) {
			return new Elipse();
		}
		return null;
	}

}
