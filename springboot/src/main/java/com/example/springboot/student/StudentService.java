package com.example.springboot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
//        return List.of(
//                new Student(
//                        1L,
//                        "Rahul",
//                        "rahul@gmail.com",
//                        DOB,
//                        LocalDate.now().getYear() - DOB.getYear()
//                )
//        );
        return studentRepository.findAll();
    }
}
