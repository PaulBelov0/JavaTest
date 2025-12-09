package entities;

import java.util.HashSet;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.time.Instant;

@Data
@Builder
public class Project {

    @Builder.Default
    private final int id = 0;

    public int getId() {
        return id != 0 ? id : 0;
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
    private Date createdAt = Date.from(Instant.now());

    public Date getCreatedAt() {
        return createdAt;
    }

    private Team team;

    @Builder.Default
    private HashSet<Task> taskList = new HashSet<Task>();

    public void setTaskList(HashSet<Task> taskList) {
        this.taskList = taskList;
    }

    public HashSet<Task> getTaskList() {
        return taskList;
    }
}
