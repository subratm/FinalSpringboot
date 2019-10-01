package com.caseStudy.SpringBootCaseStudy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caseStudy.SpringBootCaseStudy.model.User;
import com.caseStudy.SpringBootCaseStudy.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		if (userRepository.findAll().isEmpty()) {
			return new ArrayList<>();
		}
		return userRepository.findAll();
	}

	public void addNewUser(User user) {
		userRepository.save(user);
		
	}

	public void deleteUser(long userId) {
		userRepository.deleteById(userId);
		
	}

	public void updateUser(User user) {
		userRepository.save(user);
		
	}
	
	
	
}
