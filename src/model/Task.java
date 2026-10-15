package model;

import java.time.LocalDateTime;

public class Task {
    private Integer id;
    private String title;
    private String description;
    private TaskPriority priority;
    private TaskStatus status;
    private final LocalDateTime createdAt;

    public Task(String title,TaskPriority priority, String description){
        this.title=title;
        this.priority=priority;
        this.description=description;
        this.status=TaskStatus.NEW;
        this.createdAt=LocalDateTime.now();
    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getDescription() {
        return description;
    }

    public String getTittle() {
        return tittle;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
