package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User saveUser(User user)
	{
		return userRepository.save(user);
	}
	
	@Override
	public List<User> fetchUserList()
	{
		return userRepository.findAll();
	}
	
	@Override
	public User fetchUserById(Long id)
	{
		return userRepository.findById(id).get();
	}
	
	@Override
	public void deleteUserById(Long id)
	{
		userRepository.deleteById(id);
	}
	
	@Override
	public User updateUser(Long id,User user)
	{
		User colDB = userRepository.findById(id).get();
		
		if(Objects.nonNull(user.getName())  && 
				!"".equalsIgnoreCase(user.getName()))
		{
			colDB.setName(user.getName());
		}
		
		if(Objects.nonNull(user.getType())  && 
				!"".equalsIgnoreCase(user.getType()))
		{
			colDB.setType(user.getType());
		}
		
		if(Objects.nonNull(user.getPassword())  && 
				!"".equalsIgnoreCase(user.getPassword()))
		{
			colDB.setPassword(user.getPassword());
		}
		
		return userRepository.save(colDB);
	}


}
