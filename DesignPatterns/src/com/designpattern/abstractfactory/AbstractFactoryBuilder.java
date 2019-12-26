package com.designpattern.abstractfactory;

public class AbstractFactoryBuilder {

	public AbstractFactory getAbstractFactoryInstance(String abstractFactory) {

		if (abstractFactory.equalsIgnoreCase("CornerShape")) {
			return new CornerShapefactory();
		}

		if (abstractFactory.equalsIgnoreCase("NoCornerShape")) {
			return new NoCornerShapeFactory();
		}
		return null;
	}
}
