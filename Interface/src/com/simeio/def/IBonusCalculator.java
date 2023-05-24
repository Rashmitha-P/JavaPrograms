package com.simeio.def;

public interface IBonusCalculator {
	void calcInterest(double amount);

	default void greet() {
		System.out.println("welcome to java");
	}

}
