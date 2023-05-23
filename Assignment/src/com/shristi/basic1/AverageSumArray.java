package com.shristi.basic1;

import java.util.Scanner;

public class AverageSumArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, average = 0;
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the number");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("sum is : " + sum);
		average = sum / a.length;
		System.out.println("Avearge is : " + average);
		sc.close();
	}
	
}
