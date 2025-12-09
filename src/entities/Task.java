package entities;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.Instant;

@Data
@Builder
public class Task {
    private final int id;

    public int getId() {
        return id;
    }

    @Builder.Default
    private String title = "Default Title";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Builder.Default
    private String description = "";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Builder.Default
    private TaskStatus status = TaskStatus.TODO;

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Builder.Default
    private TaskPriority priority = TaskPriority.LowPriority;

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    @Builder.Default
    private String author = "Author";

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Builder.Default
    private String executor = "";

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    @Builder.Default
    private String project = "";

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Builder.Default
    private Instant createdAt = Instant.now();

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    @Builder.Default
    private Instant updatedAt = Instant.now();

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Builder.Default
    private List<String> comments = new ArrayList<>();

    public List<String> getComments() {
        return comments;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }
}
