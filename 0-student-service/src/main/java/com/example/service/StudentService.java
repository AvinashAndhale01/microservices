package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Student;

public interface StudentService {
	
	public Student addStudent(Student s);

	public Optional<Student> searchByIdService(int id);
	public List<Student> allStudent();
}