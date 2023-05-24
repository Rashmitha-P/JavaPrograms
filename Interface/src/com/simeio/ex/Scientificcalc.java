package com.simeio.ex;

public class Scientificcalc extends BasicCalculator implements Scientific {

	@Override
	public void squareroot(int x) {
		// TODO Auto-generated method stub
		System.out.println("square root :"+Math.sqrt(x));
		
	}

	@Override
	public void cube(int y) {
		// TODO Auto-generated method stub
		System.out.println("cube :"+(y*y*y));
		
	}

	
}
