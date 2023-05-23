package com.shristi.basic1;

import java.util.Scanner;

public class Evennumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a num");
	
	int num=sc.nextInt();
	
	for(int i=0;i<=num;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
	sc.close();
}
}
