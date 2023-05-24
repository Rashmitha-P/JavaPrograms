package com.simeio.inter;

public class Intermain {

	public static void main(String[] args) {
	Vehicle vehicle=new Car("bmw","Honda",980799);
	vehicle.printDetails();
vehicle.showMileage();

//downcast to insurance
//Insurance insurance=new car
Insurance insurance=(Insurance)vehicle;
insurance.showTypes();

Accessories accessories=(Accessories)vehicle;
accessories.internalAcc();
accessories.externalAcc();
	}

}
