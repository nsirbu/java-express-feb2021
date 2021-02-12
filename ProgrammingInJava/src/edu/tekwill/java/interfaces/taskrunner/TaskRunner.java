package edu.tekwill.java.interfaces.taskrunner;

import edu.tekwill.java.interfaces.tasks.Task;

/**
 * @author nsirbu
 * @since 12.02.2021
 */
public interface TaskRunner {
  void addTask(Task task);

  void executeAll();

  void afterExecution(Task task);
}
