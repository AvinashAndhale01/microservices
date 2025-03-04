package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.Repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository er;

	@Override
	public Employee addNewEmployeeService(Employee e) {
		er.save(e);// saves in the DB
		return e;
	}

	@Override
	public Employee searchByEmpIdService(int eid) {
//		Optional<Employee> e = er.findById(eid);// to find by the PK
//		if (e.isPresent())
//			return e.get();
//		throw new RuntimeException("employee not found ");
		return er.findById(eid).orElseThrow(()->new RuntimeException("Employee not found"));
	}

	@Override
	public List<Employee> allEmpsService() {
		return er.findAll();
	}

	@Override
	public List<Employee> searchByDesignationService(String designation) {
		return er.findByDesignation(designation);
	}

	@Override
	public Employee updateEmpService(Employee e) {
		er.findById(e.getEmpId()).orElseThrow(()->new RuntimeException("Employee not found"));
		return er.save(e);
	}

}