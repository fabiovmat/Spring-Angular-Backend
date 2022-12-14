package com.matt.springangular.controller;

import java.util.List;


import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.matt.springangular.model.Course;
import com.matt.springangular.repository.CourseRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CoursesController {

    
    private CourseRepository courseRepository;

    

    @GetMapping
    public @ResponseBody List<Course> list(){

        return courseRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Course create(@RequestBody Course course){
    //public ResponseEntity<Course> create(@RequestBody Course course){
       // return ResponseEntity.status(HttpStatus.CREATED)
       // .body(courseRepository.save(course));
        return courseRepository.save(course);
    }
}

    

