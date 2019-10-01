package com.caseStudy.SpringBootCaseStudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caseStudy.SpringBootCaseStudy.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {

}
