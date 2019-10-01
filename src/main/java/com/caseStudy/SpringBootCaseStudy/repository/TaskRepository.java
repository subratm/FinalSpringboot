package com.caseStudy.SpringBootCaseStudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caseStudy.SpringBootCaseStudy.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long>{

}
