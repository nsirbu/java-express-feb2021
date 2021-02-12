package edu.tekwill.java.interfaces.taskrunner;

import edu.tekwill.java.interfaces.container.Container;
import edu.tekwill.java.interfaces.tasks.Task;

import java.util.Optional;

/**
 * @author nsirbu
 * @since 12.02.2021
 */
public class CountTaskRunner implements TaskRunner {

  private Container container;
  private static int counter;

  public CountTaskRunner(Container container) {
    this.container = container;
  }

  @Override
  public void addTask(Task task) {
    container.push(task);
  }

  @Override
  public void executeAll() {
    while (!container.isEmpty()) {
      Optional<Task> possibleTaskToExecute = container.pop();
      if (possibleTaskToExecute.isPresent()) {
        Task taskToExecute = possibleTaskToExecute.get();
        taskToExecute.execute();
        afterExecution(taskToExecute);
      }
    }
  }

  @Override
  public void afterExecution(Task task) {
    counter++;
  }

  public static int getCounter() {
    return counter;
  }
}
