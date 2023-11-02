package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {
	
	public User saveUser(User user);
	
	public List<User> fetchUserList();
	
	public User fetchUserById(Long id);
	
	public void deleteUserById(Long id);
	
	public User updateUser(Long id,User user);

}
