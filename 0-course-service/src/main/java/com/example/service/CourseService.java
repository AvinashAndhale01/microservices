package com.example.service;

import java.util.Optional;

import com.example.model.Course;

public interface CourseService {
	public Course addCourse(Course c);
	public Optional<Course> searchCourse(int id);
}
