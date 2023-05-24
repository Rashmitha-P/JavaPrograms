package com.simeio.def;

public interface ILoanCalculator {
	void calcInterest(double amount);

	default void greet() {
		System.out.println("welcome to simeio");
	}
}
