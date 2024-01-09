package com.kaiburr.task1.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.kaiburr.task1.model.Task;

public interface TaskRepository extends MongoRepository<Task,String> {
	@Query("{name:?0}")
	public List<Task> GetTaskByName(String name);
	@Query("{assignee:?0}")
	public List<Task> GetTop10TaskByAssignee(String assignee);

}
