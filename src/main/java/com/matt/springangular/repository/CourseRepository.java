package com.matt.springangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matt.springangular.model.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

        
}
