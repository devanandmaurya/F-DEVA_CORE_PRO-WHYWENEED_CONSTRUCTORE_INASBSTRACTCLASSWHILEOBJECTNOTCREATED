package com.dkh.composition;

public class MainCompositionclass {
	public static void main(String[] args) {
		Car car = new Car("suski/ honda");
		Engine engine = car.getEngine();
		 System.out.println(car.getEngine());
		System.out.println(engine.getType().hashCode());
		// let destroye car obj
		car = null;
	}
}
