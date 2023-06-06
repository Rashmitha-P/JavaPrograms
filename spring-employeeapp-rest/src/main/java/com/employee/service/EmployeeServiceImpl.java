package com.employee.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.util.EmployeeDetails;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	EmployeeDetails details;

	public EmployeeServiceImpl(EmployeeDetails details) {
		super();
		this.details = details;
	}

	@Override
	public List<Employee> getAll() {

		return details.showEmployees();
	}

	@Override
	public List<Employee> getByDesignationAndCity(String designation, String city) {

		return details.showEmployees().stream()
				.filter(employee -> (employee.getDesignation().equals(designation) && employee.getCity().equals(city)))
				.collect(Collectors.toList());
	}

	@Override
	public Employee getByEmployeeId(int employeeId) {

		return details.showEmployees().stream().filter(employee -> (employee.getEmployeeId() == employeeId)).findFirst()
				.get();
	}

	@Override
	public List<Employee> getByStartingEmployeeNameAndCity(String name, String city) {

		return details.showEmployees().stream()
				.filter(employee -> (employee.getEmployeename().startsWith(name) && employee.getCity().equals(city)))

				.collect(Collectors.toList());
	}

}
