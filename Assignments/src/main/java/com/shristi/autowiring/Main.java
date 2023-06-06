package com.shristi.autowiring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.shristi");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		Performer performer = (Performer) context.getBean(Performer.class);
		performer.playSong("Violin", "hooooo");
		performer.playSong("Keyboard", "hooooo");
		performer.playSong("Guitar", "hooooo");
	}

}
