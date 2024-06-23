package com.springdataproj.springdatademo.student.service;

import com.springdataproj.springdatademo.student.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

     public List<Student> getStudents(){
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
