package com.myapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TemperatureController {

    @FXML
    private TextField inputField;

    @FXML
    private Label resultLabel;

    @FXML
    private Button convertButton;

    @FXML
    private void handleConvertButton() {
        try {
            double celsius = Double.parseDouble(inputField.getText());
            double fahrenheit = (celsius * 9 / 5) + 32;
            resultLabel.setText("Fahrenheit: " + fahrenheit);
        } catch (NumberFormatException e) {
            resultLabel.setText("Error: Invalid input!");
        }
    }
}
