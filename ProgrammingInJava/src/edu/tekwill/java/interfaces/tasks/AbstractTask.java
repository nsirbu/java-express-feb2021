package edu.tekwill.java.interfaces.tasks;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author nsirbu
 * @since 12.02.2021
 */
public abstract class AbstractTask implements Task {

  protected String id;
  protected LocalDateTime createdAt;
  protected LocalDateTime executedAt;

  protected AbstractTask() {
    id = UUID.randomUUID().toString();
    createdAt = LocalDateTime.now();
  }

  @Override
  public void execute() {
    this.executedAt = LocalDateTime.now();
    System.out.println(this);
  }

  @Override
  public void printCreatedAt() {
    System.out.println("Task created at:" + createdAt);
  }

  @Override
  public void printExecutedAt() {
    System.out.println("Task executed at:" + executedAt);
  }

  @Override
  public String toString() {
    return "AbstractTask{" +
            "id='" + id + '\'' +
            ", createdAt=" + createdAt +
            ", executedAt=" + executedAt +
            '}';
  }
}
