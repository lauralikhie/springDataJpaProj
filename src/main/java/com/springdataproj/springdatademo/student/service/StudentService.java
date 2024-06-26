package com.springdataproj.springdatademo.student.service;

import com.springdataproj.springdatademo.student.model.Student;
import com.springdataproj.springdatademo.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
