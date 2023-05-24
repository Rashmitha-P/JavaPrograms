package com.simeio.def;

public class Employee implements IBonusCalculator,ILoanCalculator {

	

	@Override
	public void calcInterest(double amount) {
		System.out.println("amount :"+amount*2);
		
	}

	@Override
	public void greet() {
		IBonusCalculator.super.greet();
		System.out.println("hi");
	}

	
	}


