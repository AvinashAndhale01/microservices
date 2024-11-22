package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ServiceRepo;
import com.example.model.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private ServiceRepo sr;
	public Course addCourse(Course c) {
		return sr.save(c);
	}

	public Optional<Course> searchCourse(int id) {
		return sr.findById(id);
	}
	
}
