package com.caseStudy.SpringBootCaseStudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.caseStudy.SpringBootCaseStudy.model.Task;
import com.caseStudy.SpringBootCaseStudy.service.TaskService;


@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/task")
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@RequestMapping()
	public List<Task> getAllTasks(){
		return taskService.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/create")
	
	public void viewTasks(@RequestBody Task task){
		 taskService.viewAllTasks(task);
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/delete")
	
	public void deleteTasks(@RequestBody long taskId){
		taskService.deleteTask(taskId);
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/update")

	public void updateTask(@RequestBody Task task) {
		 taskService.updateTask(task);

	}
}
