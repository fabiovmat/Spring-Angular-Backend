package com.matt.springangular;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.matt.springangular.model.Course;
import com.matt.springangular.repository.CourseRepository;

@SpringBootApplication
public class SpringAngularBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			Course c = new Course();
			c.setName("Angular com Spring");
			c.setCategory("front-end");

			courseRepository.save(c);
		};
			


	}


}
