package com.example.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Course;
import com.example.service.CourseService;

@RestController
public class CourseApi {
	
	@Autowired
	private CourseService cs;
	
	@PostMapping("/addCourse")
	public ResponseEntity<Course> addCourse(@RequestBody Course c){
		Course cc = cs.addCourse(c);
		return new ResponseEntity<Course>(cc,HttpStatus.CREATED);
	}
	
	@GetMapping("/searchCourse/{id}")
	public ResponseEntity<Course> searchCourse(@PathVariable int id){
		Optional<Course> cc = cs.searchCourse(id);
//		return new ResponseEntity<Course>(cc,HttpStatus.OK);
		return null;
	}
}
