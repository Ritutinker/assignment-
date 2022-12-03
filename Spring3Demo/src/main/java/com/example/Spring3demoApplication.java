package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

@SpringBootApplication
public class Spring3demoApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Spring3demoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student student = Student.builder().name("Ritu").email("ritutinker284@Gmail.com").build();
		Student student2 = Student.builder().name("Rudhra").email("rudhraanat89@Gmail.com").build();
		Student student3 = Student.builder().name("Krishna").email("krishna@Gmail.com").build();
		Student student4 = Student.builder().name("Ramesh").email("ramesh@Gmail.com").build();

		studentRepository.save(student);
		studentRepository.save(student2);
		studentRepository.save(student3);
		studentRepository.save(student4);
		System.out.println("-----------------students saved---------------------");

	}
//http://localhost:2222/students
	// http://localhost:2223/ritu/login.jsp?jsessionid=6da42393d8a4528572d3776e6d46469a
}