package org.tasktracker.dto;

import java.time.LocalDateTime;

public class CreateTaskRequest {
	private String title;
    private String description;
    private String priority;
    private LocalDateTime reminderTime;
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
	public LocalDateTime getReminderTime() {
		return reminderTime;
	}
	public void setReminderTime(LocalDateTime reminderTime) {
		this.reminderTime = reminderTime;
	}
    
    

}
