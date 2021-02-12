package edu.tekwill.java.interfaces.container;

import edu.tekwill.java.interfaces.tasks.Task;

import java.util.Optional;

/**
 * @author nsirbu
 * @since 12.02.2021
 */
public interface Container {

  Optional<Task> pop();

  void push(Task task);

  int size();

  boolean isEmpty();

  default void transferFrom(Container container) {
    while (!container.isEmpty()) {
      Optional<Task> possibleTask = container.pop();
      if (possibleTask.isPresent()) {
        push(possibleTask.get());
      }

    }
  }
}
