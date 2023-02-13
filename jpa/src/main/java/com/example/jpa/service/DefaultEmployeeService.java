package com.example.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.entities.EmployeeEntity;
import com.example.jpa.repo.EmpRepository;


@Service
public class DefaultEmployeeService implements EmployeeService {

	@Autowired
	private EmpRepository studRepository;
	@Override
	public List<EmployeeEntity> getAll() {
		// TODO Auto-generated method stub
		return studRepository.findAll();
	}
	@Override
	public EmployeeEntity getEmpByName(String empName) {
		// TODO Auto-generated method stub
		return studRepository.findByempName(empName);
	}
	@Override
	public String save(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		try {
			studRepository.save(employeeEntity);
			return "Employee Record Saved successfully...!";
		} catch (Exception e) {
			// TODO: handle exception
			return "Employee Record Not Saved...!";
		}
		
	}
	@Override
	public EmployeeEntity updateEmp(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		EmployeeEntity empList = studRepository.findByempName(employeeEntity.getEmpName());
		studRepository.delete(empList);
		return studRepository.save(employeeEntity);
	}
	@Override
	public String deleteEmp(String empName) {
		// TODO Auto-generated method stub
		try {
			EmployeeEntity emp = studRepository.findByempName(empName);
			studRepository.delete(emp);
			return "Record deleted Successfully....!";
		} catch (Exception e) {
			// TODO: handle exception
			return "Record  Not deleted....!";
		}
	}

}
