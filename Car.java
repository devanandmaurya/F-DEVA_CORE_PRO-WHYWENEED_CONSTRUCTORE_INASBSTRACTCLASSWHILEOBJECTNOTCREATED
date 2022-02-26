package com.dkh.composition;

public class Car {
	
	private final Engine engine;

	public Car(String engineType) {
		engine = new Engine();
		engine.setType(engineType);
	}

	public Engine getEngine() {
		return engine;
	}
}
