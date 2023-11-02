package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService{

	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student)
	{
		return studentRepository.save(student);
	}
	
	@Override
	public List<Student> fetchStudentList()
	{
		return studentRepository.findAll();
	}
	
	@Override
	public Student fetchStudentById(Long id)
	{
		return studentRepository.findById(id).get();
	}
	
	@Override
	public void deleteStudentById(Long id)
	{
		studentRepository.deleteById(id);
	}
	
	@Override
	public Student updateStudent(Long id,Student student)
	{
		Student colDB = studentRepository.findById(id).get();
		
		//Name
		if(Objects.nonNull(student.getName())  && 
				!"".equalsIgnoreCase(student.getName()))
		{
			colDB.setName(student.getName());
		}
		
		//College
		if(Objects.nonNull(student.getCollege())  && 
				!"".equalsIgnoreCase(student.getCollege()))
		{
			colDB.setCollege(student.getCollege());
		}
		
		//Qualification
		if(Objects.nonNull(student.getQualification()) && 
				!"".equalsIgnoreCase(student.getQualification()))
		{
			colDB.setQualification(student.getQualification());
		}
		
		//Course
		if(Objects.nonNull(student.getCourse()) && 
				!"".equalsIgnoreCase(student.getCourse()))
		{
			colDB.setCourse(student.getCourse());
		}
		
		//Year
		if(Objects.nonNull(student.getYear()))
		{
			colDB.setYear(student.getYear());
		}
		
		//Certificate
		if(Objects.nonNull(student.getCertificate()) && 
				!"".equalsIgnoreCase(student.getCertificate()))
		{
			colDB.setCertificate(student.getCertificate());
		}
		
		//Hall ticket Number
		if(Objects.nonNull(student.getHallTicketNo()))
		{
			colDB.setHallTicketNo(student.getHallTicketNo());
		}
		
		return studentRepository.save(colDB);
	}
}
