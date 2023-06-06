package com.employee.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.employee.model.Employee;

@Component
public class EmployeeDetails {
	public List<Employee> showEmployees() {
		List<Employee> employee = Arrays.asList(new Employee("Rashmitha", 10, "Developer", "Bangalore"),
				new Employee("Sushmitha", 20, "Team Leader", "Surat"),
				new Employee("Kishan", 30, "Manager", "Chennai"));

		return employee;

	}
}
