package com.shristi.basic;

public class Pattern2 {

	public static void main(String[] args) {
	int n=4;
	int x=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(x);
			x=x+1;
		}
		System.out.println();
	}

	}

}
