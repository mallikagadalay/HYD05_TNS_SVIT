package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.College;
import com.example.demo.repository.CollegeRepository;

@Service
public class CollegeServiceImplementation implements CollegeService {

	@Autowired
	CollegeRepository collegeRepository;
	
	@Override
	public College saveCollege(College college)
	{
		return collegeRepository.save(college);
	}
	
	@Override
	public List<College> fetchCollegeList()
	{
		return collegeRepository.findAll();
	}
	
	@Override
	public College fetchCollegeById(Long id)
	{
		return collegeRepository.findById(id).get();
	}
	
	@Override
	public void deleteCollegeById(Long id)
	{
		collegeRepository.deleteById(id);
	}
	
	@Override
	public College updateCollege(Long id,College college)
	{
		College colDB = collegeRepository.findById(id).get();
		
		if(Objects.nonNull(college.getCollegeName())  && 
				!"".equalsIgnoreCase(college.getCollegeName()))
		{
			colDB.setCollegeName(college.getCollegeName());
		}
		
		if(Objects.nonNull(college.getLocation()) && 
				!"".equalsIgnoreCase(college.getLocation()))
		{
			colDB.setLocation(college.getLocation());
		}
		
		if(Objects.nonNull(college.getCollegeAdmin()) && 
				!"".equalsIgnoreCase(college.getCollegeAdmin()))
		{
			colDB.setCollegeAdmin(college.getCollegeAdmin());
		}
		
		return collegeRepository.save(colDB);
	}
}
