package org.tasktracker.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tasktracker.dto.CreateTaskRequest;
import org.tasktracker.dto.TaskResponse;
import org.tasktracker.entity.Task;
import org.tasktracker.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
    TaskRepository taskRepo;

	    
	    public List<TaskResponse> createTask(CreateTaskRequest request) {
	        Task task = new Task();
	        task.setTitle(request.getTitle());
	        task.setDescription(request.getDescription());
	        task.setPriority(request.getPriority());
	        task.setReminderTime(request.getReminderTime());
	        task.setCompleted(false);
	        task.setCreatedAt(LocalDateTime.now());

	        taskRepo.save(task);
	        return getAllTasks();
	    }

	    public List<TaskResponse> getAllTasks() {
	        return taskRepo.findAll().stream().map(this::toResponse).collect(Collectors.toList());
	    }

	    public List<TaskResponse> deleteTask(Long id) {
	        taskRepo.deleteById(id);
	        return getAllTasks();
	    }

	    public List<TaskResponse> markTaskAsComplete(Long id) {
	        Task task = taskRepo.findById(id).orElseThrow();
	        task.setCompleted(true);
	        taskRepo.save(task);
	        return getAllTasks();
	    }

	    private TaskResponse toResponse(Task task) {
	        TaskResponse res = new TaskResponse();
	        res.setId(task.getId());
	        res.setTitle(task.getTitle());
	        res.setDescription(task.getDescription());
	        res.setPriority(task.getPriority());
	        res.setReminderTime(task.getReminderTime());
	        res.setCompleted(task.isCompleted());
	        res.setCreatedAt(task.getCreatedAt());
	        return res;
	    }

}
