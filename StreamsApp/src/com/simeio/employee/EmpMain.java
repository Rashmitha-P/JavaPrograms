package com.simeio.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpMain {

	public static void main(String[] args) {
		List<Employee> employee = Arrays.asList(new Employee("Rash", "Bangalore", 1),
				new Employee("Navya", "Chennai", 2), new Employee("VD", "Bangalore", 3),
				new Employee("Megha", "Bidar", 4), new Employee("Jhons", "Chennai", 5));

//	print all the employees
		for (Employee employees : employee) {
			System.out.println(employees);
		}

// print all the employees based on city
		System.out.println("-------------------------------------");
		System.out.println("print all the employees based on city");
		String city = "Bangalore";
		List<Employee> employee1 = employee.stream()
				.filter(str -> str.getCity().equals(city))
				.collect(Collectors.toList());
		employee1.forEach(str -> System.out.println(str));

			


				
	}

}
