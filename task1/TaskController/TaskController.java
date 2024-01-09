package com.kaiburr.task1.TaskController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaiburr.task1.TaskService.TaskService;
import com.kaiburr.task1.model.Task;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	@Autowired
	TaskService taskservice;
	@PostMapping("/CreateTask")
	public Task CreateTask(@RequestBody Task task) {
		return taskservice.CreateTask(task);
	}
	@GetMapping("/GetTaskById")
	public List<Task> GetAllTasks(){
		return taskservice.GetAllTasks();
	}
	@GetMapping("/GetTaskById/{Id}")
	public Task GetTaskById(@PathVariable String Id) {
		return taskservice.GetTaskById(Id);
	}
	@GetMapping("/GetTaskByName/{name}")
	public List<Task> GetTaskByName(@PathVariable String name){
		return taskservice.GetTaskByName(name);
	}
	@GetMapping("/GetTop10TaskByAssignee/{assignee}")
	public ResponseEntity<List<Task>> GetTop10TaskByAssignee(@PathVariable String assignee){
		
		List<Task> tasks = taskservice.GetTop10TaskByAssignee(assignee);
		
		if (tasks.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return ResponseEntity.ok(tasks);
        }
	}
	@DeleteMapping("/DeleteTaskById/{Id}")
	public void DeleteTaskById(@PathVariable String Id) {
		taskservice.DeleteTaskById(Id);
		System.out.println("successfully deleted");
	}

}
