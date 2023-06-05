package com.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.auto.Restaurant;

@SpringBootApplication
public class SpringBootAssignmentApplication implements CommandLineRunner{
	@Autowired
 Restaurant restaurant ;
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
System.out.println(restaurant.displayMenu("indian"));
		
		
	}

}
