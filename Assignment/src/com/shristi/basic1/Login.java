package com.shristi.basic1;

import java.util.Scanner;

public class Login {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a[]= {"Rashmi","Megha","Ganga","Bhagya"};
	System.out.println("Enter username to login");
	String username=sc.nextLine();
	for(int i=0;i<a.length;i++)
	{
		if(a[i].equals(username)) {
			
		
		System.out.println("you are logged successfully");
		break;
		}
		else {
			System.out.println("Invalid username");
			break;
		}
	}
	sc.close();
}
}
