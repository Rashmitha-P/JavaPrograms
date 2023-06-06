package com.employee.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.IEmployeeService;
@RestController
@RequestMapping("/employee-api")
public  class EmployeeController {
@Autowired	
IEmployeeService employeeService;

public EmployeeController() {
	super();
	// TODO Auto-generated constructor stub
}
@GetMapping("/employees")
List<Employee> getAll(){
	return employeeService.getAll();
}
@GetMapping("/employees/designation/city")
List<Employee> getByDesignationAndCity(@RequestParam("designation")String designation, @RequestParam("city")String city){
	return employeeService.getByDesignationAndCity(designation, city);
}
@GetMapping("/employees/id/{employeeId}")
Employee getByEmployeeId(@PathVariable("employeeId")int employeeId) {
	return employeeService.getByEmployeeId(employeeId);
}
@GetMapping("/employees/name/{name}/city/{city}")
List<Employee> getByStartingEmployeeNameAndCity(@PathVariable("name")String name, @PathVariable("city")  String city){	
	return employeeService.getByStartingEmployeeNameAndCity(name, city);	
}
}
