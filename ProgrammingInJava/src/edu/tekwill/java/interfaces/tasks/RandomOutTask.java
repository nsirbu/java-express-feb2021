package edu.tekwill.java.interfaces.tasks;

import java.util.Random;

/**
 * @author nsirbu
 * @since 12.02.2021
 */
public class RandomOutTask extends AbstractTask {

  private int randomNumber;

  public RandomOutTask() {
    Random rd = new Random();
    this.randomNumber = rd.nextInt(100);
  }

  @Override
  public String toString() {
    return "RandomOutTask{" +
            "randomNumber=" + randomNumber +
            '}';
  }
}
