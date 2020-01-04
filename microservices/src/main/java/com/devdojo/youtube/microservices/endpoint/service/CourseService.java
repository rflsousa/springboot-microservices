package com.devdojo.youtube.microservices.endpoint.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devdojo.youtube.microservices.model.Course;
import com.devdojo.youtube.microservices.repository.CourseRepository;

@Service
public class CourseService {
	
	Logger logger = LoggerFactory.getLogger(CourseService.class);
	
	private final CourseRepository courseRepository ;
	
	public CourseService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
	
	public Iterable<Course> list(Pageable pageable){
		logger.info("Listing all courses");
		return courseRepository.findAll(pageable);
	}
	
}
