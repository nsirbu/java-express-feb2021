package edu.tekwill.java.interfaces.container;

import edu.tekwill.java.interfaces.tasks.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author nsirbu
 * @since 12.02.2021
 */
public class Stack implements Container {

  List<Task> tasks;

  public Stack() {
    this.tasks = new ArrayList<>();
  }

  @Override
  public Optional<Task> pop() {
    if (tasks.size() - 1 >= 0) {
      Task taskToRetrieve = tasks.get(tasks.size() - 1);
      tasks.remove(tasks.size() - 1);
      return Optional.of(taskToRetrieve);
    }

    return Optional.empty();
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
    return "Stack{" +
            "tasks=" + tasks +
            '}';
  }
}
