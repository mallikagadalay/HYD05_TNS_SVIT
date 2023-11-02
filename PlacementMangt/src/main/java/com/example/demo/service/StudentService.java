package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;


public interface StudentService {
	
	public Student saveStudent(Student student);

	public List<Student> fetchStudentList();

	public Student fetchStudentById(Long id);

	public void deleteStudentById(Long id);

	public Student updateStudent(Long id,Student student);

}
