package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface IEmployeeService {
	List<Employee> getAll();

	List<Employee> getByDesignationAndCity(String designation, String city);

	Employee getByEmployeeId(int employeeId);

	List<Employee> getByStartingEmployeeNameAndCity(String name, String city);
}
