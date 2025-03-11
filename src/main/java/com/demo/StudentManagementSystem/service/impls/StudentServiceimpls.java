package com.demo.StudentManagementSystem.service.impls;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.StudentManagementSystem.entity.Student;
import com.demo.StudentManagementSystem.repository.StudentRepository;
import com.demo.StudentManagementSystem.service.StudentService;

@Service
public class StudentServiceimpls implements StudentService {

	
private StudentRepository studentRepository;
	
	public StudentServiceimpls(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(int id) {
		studentRepository.deleteById(id);	
	}

}
