package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student)
	{
		return studentService.saveStudent(student);
	}

	@GetMapping("/student")
	public List<Student> fetchStudentList()
	{
		return studentService.fetchStudentList();
	}
	
	// Get by ID
	@GetMapping("/student/{id}")
	public Student fetchStudentById(@PathVariable("id") Long id)
	{
		return studentService.fetchStudentById(id);
	}
		
	@DeleteMapping("/student/{id}")
	public String deleteStudentById(@PathVariable("id") Long id)
	{
		studentService.deleteStudentById(id);
		return "College id deleted Successfully !!";
	}
		
	@PutMapping("/student/{id}")
	public Student updateStudent(@PathVariable("id") Long id,@RequestBody Student student)
	{
		return studentService.updateStudent(id,student);
	}

}
