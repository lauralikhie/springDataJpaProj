package com.springdataproj.springdatademo.student.controller;


import com.springdataproj.springdatademo.student.model.Student;
import com.springdataproj.springdatademo.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/getstudents")
    public List<Student> getString() {
       return studentService.getStudents();
    }
}
