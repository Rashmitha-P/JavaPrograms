package com.shristi.basic;

public class SumAndAverage {

	public static void main(String[] args) {
		int sum=0;
		float average;
		int []a= {1,2,3,4,5};
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("sum  : " +sum);
average=(float)sum / a.length;
System.out.println("average : " + average);
	}

}
