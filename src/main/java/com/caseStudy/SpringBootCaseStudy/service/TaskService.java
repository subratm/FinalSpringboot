package com.caseStudy.SpringBootCaseStudy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caseStudy.SpringBootCaseStudy.model.Task;
import com.caseStudy.SpringBootCaseStudy.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository repo;

	public List<Task> getAll() {
		if (repo.findAll().isEmpty()) {
			return new ArrayList<>();
		}
		return repo.findAll();
	}

	public void viewAllTasks(Task task) {
		repo.save(task);
	}

	public void deleteTask(long taskId) {
		repo.deleteById(taskId);
	}

	public void updateTask(Task task) {
		 repo.save(task);

	}

}
