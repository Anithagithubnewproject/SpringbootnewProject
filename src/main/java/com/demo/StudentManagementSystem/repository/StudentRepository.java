package com.demo.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.StudentManagementSystem.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	

}
