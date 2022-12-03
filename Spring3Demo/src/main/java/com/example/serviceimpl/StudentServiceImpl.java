package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student postStudent(Student s) {

		return studentRepository.save(s);
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student params, int id) {
		// TODO Auto-generated method stub
		Student _student = studentRepository.findById(id).get();
		_student.setName(params.getName());
		_student.setEmail(params.getEmail());
		return studentRepository.save(_student);
	}

	@Override
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return "the student with id " + id + " has been deleted...";
	}

}