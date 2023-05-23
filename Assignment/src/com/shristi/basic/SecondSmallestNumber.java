package com.shristi.basic;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int a[]= {19,86,90,67,4};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[j]<a[i])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}

	}
	System.out.println(a[1]);

	}

}
