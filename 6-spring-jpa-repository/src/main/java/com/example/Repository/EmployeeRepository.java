package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	List<Employee> findByDesignation(String designation);
}
