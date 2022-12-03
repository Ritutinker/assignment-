package com.example.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.entity.Student;

@Component
public interface StudentService {

	Student postStudent(Student s);

	Student getStudent(int id);

	List<Student> getAllStudents();

	Student updateStudent(Student params, int id);

	String deleteStudent(int id);

}