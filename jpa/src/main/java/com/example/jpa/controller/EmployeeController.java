package com.example.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.entities.EmployeeEntity;
import com.example.jpa.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/emps", method = RequestMethod.GET)
	public List<EmployeeEntity> getEmployeeEntities(){
		return employeeService.getAll();
	}
	
	@RequestMapping(value = "/emp", method = RequestMethod.GET)
	public EmployeeEntity getEmployee(@RequestParam String ename){
		return employeeService.getEmpByName(ename);
	}
	
	@RequestMapping(value = "/emp", method = RequestMethod.POST)
	public String saveEmp(@RequestBody EmployeeEntity employeeEntity) {
		return employeeService.save(employeeEntity);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public EmployeeEntity updateEmp(@RequestBody EmployeeEntity employeeEntity) {
		return employeeService.updateEmp(employeeEntity);
		
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public String deleteEmpbyName(@RequestParam String Empname) {
		return employeeService.deleteEmp(Empname);
		
	}

}
