package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.repository.AdminRepository;


@Service
public class AdminServiceImplementation implements AdminService{
	
	@Autowired
	AdminRepository adminrepository;
	
	@Override
	public Admin saveAdmin(Admin admin)
	{
		return adminrepository.save(admin);
	}
	
	@Override
	public List<Admin> fetchAdminList()
	{
		return adminrepository.findAll();
	}
	
	@Override
	public Admin fetchAdminById(Long id)
	{
		return adminrepository.findById(id).get();
	}
	
	@Override
	public void deleteAdminById(Long id)
	{
		adminrepository.deleteById(id);
	}
	
	@Override
	public Admin updateAdmin(Long id,Admin admin)
	{
		Admin colDB = adminrepository.findById(id).get();
		
		if(Objects.nonNull(admin.getName())  && 
				!"".equalsIgnoreCase(admin.getName()))
		{
			colDB.setName(admin.getName());
		}
		
		if(Objects.nonNull(admin.getPassword()) && 
				!"".equalsIgnoreCase(admin.getPassword()))
		{
			colDB.setPassword(admin.getPassword());
		}
		
		return adminrepository.save(colDB);
	}


}
