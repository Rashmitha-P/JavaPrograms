package com.employee.model;

public class Employee {
private String employeeName;
private int employeeId;
private String designation;
private String city;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String employeename, int employeeId, String designation, String city) {
	super();
	this.employeeName = employeename;
	this.employeeId = employeeId;
	this.designation = designation;
	this.city = city;
}
public String getEmployeename() {
	return employeeName;
}
public void setEmployeename(String employeename) {
	this.employeeName = employeename;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Employee [employeename=" + employeeName + ", employeeId=" + employeeId + ", designation=" + designation
			+ ", city=" + city + "]";
}

}
