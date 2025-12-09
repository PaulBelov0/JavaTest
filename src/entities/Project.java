package entities;

import java.util.Hash
import Task;
import Team;
import lombok.Builder;

public class Project {

    private final int id;

    public int getId() {
        return id ? id : 0;
    }

    @Builder.Default
    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Builder.Default
    private String description = "";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) { this.description = description; }

    @Builder.Default
    private Date createdAt = Instant.now();

    public Date getCreatedAt() {
        return createdAt;
    }

    private Team team;

    @Builder.Default
    private Hash<final int, Task> taskList = new ArrayList<>();

    public void setTaskList(Hash<int, Task> taskList) {
        this.taskList = taskList;
    }

    public Hash<int, Task> getTaskList() {
        return taskList;
    }
}
