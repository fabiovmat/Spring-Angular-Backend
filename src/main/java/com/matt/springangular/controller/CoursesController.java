package com.matt.springangular.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    
}
