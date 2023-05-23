package com.shristi.basic1;

import java.util.Scanner;

public class Squareroot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array values");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Square root of new Array Values");
		int a1[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a1[i] = (int) Math.sqrt(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a1[i]);
		}

	}

}
