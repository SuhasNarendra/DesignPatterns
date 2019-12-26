package com.designpattern.abstractfactory;

public class Test {

	public static void main(String[] args) {

		AbstractFactoryBuilder builder = new AbstractFactoryBuilder();
		AbstractFactory factory = builder.getAbstractFactoryInstance("CornerShape");
		Shape shape = factory.getShape("Elipse");
		shape.draw();
	}

}
