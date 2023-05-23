package com.shristi.basic;

public class ReverseArrayNumbers {

	public static void main(String[] args) {
		int [] a= {896,854,123,4356};
		
		for(int i=0;i<a.length;i++)
		{
			int rev=reverse(a[i]);
			System.out.println("reverse of array is " + rev);
		}}
		static int reverse(int n)
		{
			int rev=0;
			while(n!=0)
			{
				int x=n%10;
			rev=rev*10+x;
			n=n/10;
		}
		return rev;

	}
	
}
