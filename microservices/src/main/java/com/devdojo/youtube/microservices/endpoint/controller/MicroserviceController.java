package com.devdojo.youtube.microservices.endpoint.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devdojo.youtube.microservices.endpoint.service.CourseService;
import com.devdojo.youtube.microservices.model.Course;

@RestController
@RequestMapping("v1/admin/course")
public class MicroserviceController {

	Logger logger = LoggerFactory.getLogger(MicroserviceController.class);
	
	private final CourseService courseService ;
	
	public MicroserviceController(CourseService courseService) {
		this.courseService= courseService;
	}
	
	@GetMapping
	public ResponseEntity<Iterable<Course>> list(Pageable pageable){
		return new ResponseEntity<>(courseService.list(pageable), HttpStatus.OK);
	}
	
	
}
