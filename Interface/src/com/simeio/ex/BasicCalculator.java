package com.simeio.ex;

public class BasicCalculator implements ICalculator{

	@Override
	public void add(int x, int y) {
	int res=x+y;
	System.out.println(res);
		
	}

	@Override
	public void product(int x, int y) {
	int product=x*y;
	System.out.println(product);
		
	}

	@Override
	public void diff(int x, int y) {
		int diff=x-y;
		System.out.println(diff);
		
	}
	
}
