package com.dmitriitrofimov.spring.springboot.spring_course_boot.service;


import com.dmitriitrofimov.spring.springboot.spring_course_boot.entity.Employee;

import java.util.List;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public void saveEmployee(Employee employee);

	public Employee getEmployee(int id);

	public void deleteEmployee(int id);
}