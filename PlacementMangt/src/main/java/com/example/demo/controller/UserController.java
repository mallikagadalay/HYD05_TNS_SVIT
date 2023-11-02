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

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user)
	{
		return userService.saveUser(user);
	}
	
	@GetMapping("/user")
	public List<User> fetchUserList()
	{
		return userService.fetchUserList();
	}
	
	// Get by ID
	@GetMapping("/user/{id}")
	public User fetchUserById(@PathVariable("id") Long id)
	{
		return userService.fetchUserById(id);
	}
	
	@DeleteMapping("/user/{id}")
	public String deleteUserById(@PathVariable("id") Long id)
	{
		userService.deleteUserById(id);
		return "User is deleted Successfully !!";
	}
	
	@PutMapping("/user/{id}")
	public User upadteUser(@PathVariable("id") Long id,@RequestBody User user)
	{
		return userService.updateUser(id, user);
	}
}
