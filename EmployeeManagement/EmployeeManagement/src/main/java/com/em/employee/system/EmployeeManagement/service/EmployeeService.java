package com.em.employee.system.EmployeeManagement.service;

import java.util.List;

import com.em.employee.system.EmployeeManagement.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);
}