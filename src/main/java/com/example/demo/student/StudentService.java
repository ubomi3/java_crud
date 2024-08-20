package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


import static java.time.Month.JANUARY;
@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Bomi",
                        "bomi@bomi.com",
                        LocalDate.of(2000, Month.JANUARY, 21),
                        21
                )
        );
    }
}
