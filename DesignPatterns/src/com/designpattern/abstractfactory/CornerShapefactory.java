package com.designpattern.abstractfactory;

public class CornerShapefactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {

		if (shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}

		if (shape.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}

}
