package com.example.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.entities.EmployeeEntity;

public interface EmpRepository extends JpaRepository<EmployeeEntity, Long> {

	EmployeeEntity findByempName(String empName);
}
