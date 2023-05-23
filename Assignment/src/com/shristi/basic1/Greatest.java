package com.shristi.basic1;



public class Greatest {

	public static void main(String[] args) {
		int num1=90, num2=80,num3=100;
		int res=(num1>=num2 && num1>num3)?num1 : (num2>num3)?num2 : num3;
		System.out.println(res + " is greater" );
			}

}
