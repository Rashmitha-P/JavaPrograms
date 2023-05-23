package com.shristi.basic;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int sum=0;
		int count=0;
		int copy=num;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
//		System.out.println(count);
		
		while(temp>0)
		{int rem=temp%10;
		sum=sum+(int)Math.pow(rem, count);
		temp=temp/10;
		}
//		System.out.println(sum);
		if(sum==copy)
			System.out.println(copy+" is Arm Strong Number");
		else
			System.out.println(copy+" is not an  Arm Strong Number");
	}

		}


