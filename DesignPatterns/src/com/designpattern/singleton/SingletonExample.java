package com.designpattern.singleton;

class SingletonClass {
	private static SingletonClass instance = null;

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {

		if (instance == null) {
			instance = new SingletonClass();
		}
		return instance;
	}
}

public class SingletonExample {

	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.getInstance();
		System.out.println(obj1.hashCode());
		SingletonClass obj2 = SingletonClass.getInstance();
		System.out.println(obj2.hashCode());
	}
}
