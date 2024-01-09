package com.kaiburr.task1.TaskService;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaiburr.task1.model.Task;
import com.kaiburr.task1.repository.TaskRepository;

@Service
public class TaskService {
	@Autowired
	TaskRepository repository;
	
	public Task CreateTask(Task task) {
		Random random = new Random();
		task.setId(UUID.randomUUID().toString().split("-")[0]);
		String originalString ="Akhilesh";
		char[] originalChars = originalString.toCharArray();
		StringBuilder randomChars = new StringBuilder();
		for (int i = 0; i < 5; i++) {
	        int randomIndex = random.nextInt(originalChars.length);
	        randomChars.append(originalChars[randomIndex]);
	    }
		task.setAkhileshProperty(randomChars.toString());

		return repository.save(task); 
		
	}
	public List<Task> GetAllTasks(){
		return repository.findAll();
	}
	public Task GetTaskById(String Id) {
		return repository.findById(Id).get();
	}
	public List<Task> GetTaskByName(String name){
		return repository.GetTaskByName(name);
	}
	public List<Task> GetTop10TaskByAssignee(String assignee){
		List<Task> tasks = repository.GetTop10TaskByAssignee(assignee);
		
		return tasks.stream().sorted(Comparator.comparing(Task::getStartTime)).limit(10).collect(Collectors.toList());
	}
	public void DeleteTaskById(String Id) {
		repository.deleteById(Id);
	}
	public Task UpdateTaskById(Task task) {
		Task existingtask=repository.findById(task.getId()).get();
		existingtask.setAssignee(task.getAssignee());
		existingtask.setName(task.getName());
		existingtask.setProject(task.getProject());
		existingtask.setAkhileshProperty(task.getAkhileshProperty());
		existingtask.setStartTime(task.getStartTime());
		return repository.save(existingtask);
	}
	

}
