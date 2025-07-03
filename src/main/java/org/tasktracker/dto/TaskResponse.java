package org.tasktracker.dto;

import java.time.LocalDateTime;

public class TaskResponse {
	private Long id;
    private String title;
    private String description;
    private String priority;
    private boolean completed;
    private LocalDateTime reminderTime;
    private LocalDateTime createdAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public LocalDateTime getReminderTime() {
		return reminderTime;
	}
	public void setReminderTime(LocalDateTime reminderTime) {
		this.reminderTime = reminderTime;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
    
    
}
