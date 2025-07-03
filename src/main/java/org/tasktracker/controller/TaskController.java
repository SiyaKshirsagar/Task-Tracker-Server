package org.tasktracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tasktracker.dto.CreateTaskRequest;
import org.tasktracker.dto.TaskResponse;
import org.tasktracker.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = { "http://localhost:3000","http://localhost:5173"})
public class TaskController {
	  
	  @Autowired
	  TaskService taskService;

	  
	    @PostMapping
	    public List<TaskResponse> createTask(@RequestBody CreateTaskRequest request) {
	        return taskService.createTask(request);
	    }

	    @GetMapping
	    public List<TaskResponse> getAllTasks() {
	        return taskService.getAllTasks();
	    }

	    @DeleteMapping("/{id}")
	    public List<TaskResponse> deleteTask(@PathVariable Long id) {
	        return taskService.deleteTask(id);
	    }

	    @PutMapping("/{id}/complete")
	    public List<TaskResponse> markTaskAsComplete(@PathVariable Long id) {
	        return taskService.markTaskAsComplete(id);
	    }
}
