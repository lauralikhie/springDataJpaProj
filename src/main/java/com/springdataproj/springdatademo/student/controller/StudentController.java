package com.springdataproj.springdatademo.student.controller;


import com.springdataproj.springdatademo.student.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
public class StudentController {

      @GetMapping(path = "/student")
    public List<Student> getString() {
           return List.of(
                   new Student(
                            1l  ,
                           "Mariam",
                           LocalDate.of(2000, Month.JANUARY,21) ,
                           "mariam@gmail.com",
                           21
                   )
           ) ;
      }
}
