package com.springdataproj.springdatademo.student.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence" ,
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private LocalDate DOB;
    private String email;
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Student() {
    }

    public Student(String name, LocalDate DOB, String email, int age) {
        this.name = name;
        this.DOB = DOB;
        this.email = email;
        this.age = age;
    }

    public Student(Long id, String name, LocalDate DOB, String email, int age) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", DOB=").append(DOB);
        sb.append(", email='").append(email).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
