package com.simeio.fun;
//using lambda
public class CalcDemo {

	interface Calculator{
		int calculate(int x,int y);
	}
	
	
	public static void main(String[] args) {
		
		Calculator calculate=(x,y)->{
		return x+y;
		};
System.out.println(calculate.calculate(10, 20));
		
  calculate=(x,y)->{
	  return x-y;	
	};
	System.out.println(calculate.calculate(50, 20));
	
	
	 calculate=(x,y)->{
		  return x*y;
			
		};
		System.out.println(calculate.calculate(9, 9));
		
		 calculate=(x,y)->{
			  return x/y;
				
			};
			System.out.println(calculate.calculate(20, 20));

	}

}
