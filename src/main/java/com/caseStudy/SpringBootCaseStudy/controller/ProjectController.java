package com.caseStudy.SpringBootCaseStudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.caseStudy.SpringBootCaseStudy.model.Project;
import com.caseStudy.SpringBootCaseStudy.service.ProjectService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@RequestMapping()
	public List<Project> getAllProjects(){
		return projectService.getAllProjects();
}

 @RequestMapping(method=RequestMethod.POST,value="/create")
 
 public void viewProjects(@RequestBody Project project) {
	 projectService.viewAllProjects(project);	 
 }
	
 	@RequestMapping(method=RequestMethod.POST,value="/update")
	
 	public void updateProject(@RequestBody Project project) {
 		projectService.updateProject(project);
 	}
 	
 	@RequestMapping(method=RequestMethod.POST,value="/delete")

 	public void deleteProject(@RequestBody long projectId) {
 		projectService.deleteProject(projectId);
 		
 	}
}
