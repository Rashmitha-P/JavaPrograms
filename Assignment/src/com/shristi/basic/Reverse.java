package com.shristi.basic;

public class Reverse {

	public static void main(String[] args) {
		int num=1234 , rev=0 ;
		while(num>0)
		{int x=num%10;
		rev=rev*10+x;
		num=num/10;
		
		}
System.out.println(rev);
	}

}
