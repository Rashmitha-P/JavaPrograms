package com.simeio.def;

public class DefDemo {

	public static void main(String[] args) {
		IBonusCalculator bonus=new Employee();
		bonus.calcInterest(2000);
		bonus.greet();
		ILoanCalculator loan=(ILoanCalculator)bonus;
		loan.calcInterest(980);

	}

}
