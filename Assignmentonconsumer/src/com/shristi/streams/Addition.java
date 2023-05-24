package com.shristi.streams;

import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class Addition {
public static void main(String[] args) {
	System.out.println("using lambda");
	Consumer<Integer>consumer=(number)->System.out.println(number+number);
	consumer.accept(20);
	System.out.println("-----------------------");
	System.out.println("using consumer");
	BiConsumer<Integer, Integer> biConsumer=(num1,num2)->System.out.println(num1+num2);
	biConsumer.accept(30,20);
}
}
