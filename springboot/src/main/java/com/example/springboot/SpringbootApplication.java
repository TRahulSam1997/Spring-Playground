package com.example.springboot;

import com.example.springboot.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringbootApplication {
	private static final LocalDate DOB = LocalDate.of(2000, Month.JANUARY, 5);
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(
						1L,
						"Rahul",
						"rahul@gmail.com",
						DOB,
						LocalDate.now().getYear() - DOB.getYear()
				)
		);
	}
}
