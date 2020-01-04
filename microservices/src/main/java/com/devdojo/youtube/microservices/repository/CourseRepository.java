package com.devdojo.youtube.microservices.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.devdojo.youtube.microservices.model.Course;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{

}
