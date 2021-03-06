package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class Controller {
  public TextField temperatureInput;
  public RadioButton celsiusRadioBtn;
  public RadioButton fahrenheitRadioBtn;
  public Label convertedTemperatureLabel;

  public void convertTemperature(ActionEvent actionEvent) {
    double convertedValue = 0.0;
    TemperatureConverter temperatureConverter = new TemperatureConverter();

    if (temperatureInput.getText().isEmpty()) {
      return;
    }

    int temperatureToConvert = Integer.valueOf(temperatureInput.getText());

    if (celsiusRadioBtn.isSelected()) {
      convertedValue = temperatureConverter.toCelsius(temperatureToConvert);
    }

    if (fahrenheitRadioBtn.isSelected()) {
      convertedValue = temperatureConverter.toFahrenheit(temperatureToConvert);
    }

    DecimalFormat df = new DecimalFormat("#.###");
    String formattedValue = df.format(convertedValue);
    convertedTemperatureLabel.setText(formattedValue);
  }
}
