package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Admin;

public interface AdminService {

	public Admin saveAdmin(Admin admin);

	public List<Admin> fetchAdminList();

	public Admin fetchAdminById(Long id);

	public void deleteAdminById(Long id);

	public Admin updateAdmin(Long id, Admin admin);

}
