package com.shristi.streams;

import java.util.function.Supplier;

public class StringtoUppercase {
public static void main(String[] args) {
	
	Supplier<String> supplier=()->"Hello".toUpperCase();
	System.out.println(supplier.get());
}
}
