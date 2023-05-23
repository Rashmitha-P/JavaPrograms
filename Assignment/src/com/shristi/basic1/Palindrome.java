package com.shristi.basic1;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int rev = 0;
		int copy = num;
		while (num != 0) {
			num = num % 10;
			rev = rev * 10 + num;
			num = num / 10;
		}
		if (copy == rev) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
		sc.close();
	}
}
