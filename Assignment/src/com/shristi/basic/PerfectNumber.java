package com.shristi.basic;

public class PerfectNumber {

	public static void main(String[] args) {
		int num=28,sum =0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			
				sum=sum+i;
			}
			if(sum==num)
				System.out.println(num + " Is a Perfect Number");
			else
				System.out.println(num + " Is not a Perfect Number");
			
		}

	}


