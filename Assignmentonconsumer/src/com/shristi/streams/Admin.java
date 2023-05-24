package com.shristi.streams;

import java.util.function.BiConsumer;

public class Admin {
public static void main(String[] args) {
	BiConsumer<String,Integer> biconsumer=(name,age)->{
		if(name.equals("Admin") && age>30)
		System.out.println("Welcome "+name);
		else
			System.out.println("Invalid user");	
	};
	biconsumer.accept("Admin", 50);
}
}
