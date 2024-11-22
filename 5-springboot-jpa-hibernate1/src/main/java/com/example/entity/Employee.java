package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity // mandatory
@Data //need sts plugin otherwise don't work
public class Employee {
//	@Id // mandatory
//	@GeneratedValue // to autogenerate empid(optional)
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator ="myseq" )
	@SequenceGenerator(name="myseq",sequenceName = "emp_seq",initialValue = 1000)
	private int empId;
	private String empName;
	private String designation;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId, String empName, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + "]";
	}
	
}
