package com.example.springboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    private static final LocalDate DOB = LocalDate.of(2000, Month.JANUARY, 5);
    private static final LocalDate DOB2 = LocalDate.of(1997, Month.FEBRUARY, 5);

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                "Rahul",
                "rahul@gmail.com",
                DOB
            );

            Student alex = new Student(
                    "Rahul",
                    "alex@gmail.com",
                    DOB2
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
