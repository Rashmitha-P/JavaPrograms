package com.simeio.inter;

public class Car extends Vehicle implements Accessories{

	public Car(String model, String brand, double price) {
		super(model, brand, price);
		
	}

	@Override
	public void showTypes() {
		System.out.println("insurance for damage");
		
	}

	@Override
	public void externalAcc() {
		System.out.println("external covers");
		System.out.println("rear view cameras");
	}

	@Override
	public void internalAcc() {
		System.out.println("music system");
		System.out.println("dash camera");
		
	}

	@Override
	void showMileage() {
		System.out.println("15km/hr");
		
	}

}
