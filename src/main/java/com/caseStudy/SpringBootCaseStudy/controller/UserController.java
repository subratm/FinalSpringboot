package com.caseStudy.SpringBootCaseStudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.caseStudy.SpringBootCaseStudy.model.User;
import com.caseStudy.SpringBootCaseStudy.service.UserService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping()
	public List<User> getallUsers(){
	
		return userService.getAllUsers();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/create")
	public void addUser(@RequestBody User user) {
		System.out.println(user);
		userService.addNewUser(user);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/delete")
	public void deleteUser(@RequestBody long userId) {
		userService.deleteUser(userId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/update")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
}
