package com.demo.StudentManagementSystem.service;

import java.util.List;

import com.demo.StudentManagementSystem.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student getStudentById(int id);

	Student updateStudent(Student student);

	void deleteStudentById(int id);

	// Student saveStudents(Student student);

}
