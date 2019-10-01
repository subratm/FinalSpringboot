package com.caseStudy.SpringBootCaseStudy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caseStudy.SpringBootCaseStudy.model.Project;
import com.caseStudy.SpringBootCaseStudy.model.Task;
import com.caseStudy.SpringBootCaseStudy.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	public List<Project> getAllProjects() {
		return projectRepository.findAll();
		
	}

	public void viewAllProjects(Project project) {
		projectRepository.save(project);
		
	}

	public void updateProject(Project project) {
		
		projectRepository.save(project);
		
		
	}

	public void deleteProject(long projectId) {
		projectRepository.deleteById(projectId);
		
	}

	
}
