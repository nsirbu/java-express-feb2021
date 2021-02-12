package edu.tekwill.java.interfaces.container;

import edu.tekwill.java.interfaces.tasks.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author nsirbu
 * @since 12.02.2021
 */
public class Queue implements Container {

  List<Task> tasks;

  public Queue() {
    this.tasks = new ArrayList<>();
  }

  @Override
  public Optional<Task> pop() {
    Task taskToRetrieve = tasks.get(0);
    tasks.remove(0);
    return Optional.of(taskToRetrieve);
  }

  @Override
  public void push(Task task) {
    tasks.add(task);
  }

  @Override
  public int size() {
    return tasks.size();
  }

  @Override
  public boolean isEmpty() {
    return tasks.isEmpty();
  }

  @Override
  public String toString() {
    return "Queue{" +
            "tasks=" + tasks +
            '}';
  }
}
