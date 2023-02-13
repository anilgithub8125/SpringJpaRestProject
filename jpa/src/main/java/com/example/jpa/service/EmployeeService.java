package com.example.jpa.service;

import java.util.List;

import com.example.jpa.entities.EmployeeEntity;

public interface EmployeeService {
	
	List<EmployeeEntity> getAll();
	
	EmployeeEntity getEmpByName(String empName);
	
	String save(EmployeeEntity employeeEntity);
	
	EmployeeEntity updateEmp(EmployeeEntity employeeEntity);
	
	String deleteEmp(String empName);

}
