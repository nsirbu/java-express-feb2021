package sample;

/**
 * @author nsirbu
 * @since 05.02.2021
 */
public class TemperatureConverter {

  double toCelsius(int temperatureToConvert) {
    return (5 * (temperatureToConvert - 32)) / 9d;
  }

  double toFahrenheit(int temperatureToConvert) {
    return (double) (9 * temperatureToConvert + (32 * 5)) / 5;
  }
}
