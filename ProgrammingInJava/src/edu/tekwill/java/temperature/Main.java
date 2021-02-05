package edu.tekwill.java.temperature;

/**
 * @author nsirbu
 * @since 05.02.2021
 */
public class Main {
  public static void main(String[] args) {
    TemperatureConverter temperatureConverter = new TemperatureConverter();

    double convertedToCelsius = temperatureConverter.toCelsius(123);
    System.out.println("Converted to celsius: " + convertedToCelsius);

    double convertedToFahrenheit = temperatureConverter.toFahrenheit(36);
    System.out.println("Converted to fahrenheit: " + convertedToFahrenheit);
  }
}
