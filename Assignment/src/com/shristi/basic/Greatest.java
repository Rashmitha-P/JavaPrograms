package com.shristi.basic;

public class Greatest {

	public static void main(String[] args) {
		int [] a= {10,60,80,70};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
