package com.shristi.basic1;

public class Longestword {
	public static void main(String[] args) {
		String s = "I am working in simeio";
		String[] word = s.split(" ");
		String longword = " ";
		for (int i = 0; i < word.length; i++)
			for (int j = 1 + i; j < word.length; j++)
				if (word[i].length() >= word[j].length())
					longword = word[i];
		System.out.println(longword + " is the longest word ");

	}
}
