package com.example.vehicletaxcalculator;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import static com.example.vehicletaxcalculator.Vehictype.*;

public class VehicleTaxController {
    @FXML
    private Label studentInfoLabel;
    @FXML
    private Label instructionLabel;
    @FXML
    private Label resultLabel;
    @FXML
    private RadioButton carRadioButton;
    @FXML
    private RadioButton busRadioButton;
    @FXML
    private RadioButton truckRadioButton;
    @FXML
    private TextField engineCapacityTextField;
    @FXML
    private TextField manufactureYearTextField;
    @FXML
    private Button calculateButton;

    public VehicleTaxController() {
    }

    public void initialize() {
        studentInfoLabel.setText("Student ID: YourStudentID | Your Name Surname");
        resultLabel.setText("");
    }

    @FXML
    public void calculateTax(ActionEvent event) {
        try {
            int engineCapacity = Integer.parseInt(engineCapacityTextField.getText());
            int manufactureYear = Integer.parseInt(manufactureYearTextField.getText());
            Vehictype vehictype = getSelectedVehicleType();

            double tax = calculateTax(vehictype, engineCapacity, manufactureYear);

            resultLabel.setText("Tax: " + String.format("%.2f som", tax));
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter valid values for engine capacity and manufacture year.");
        }
    }

    private Vehictype getSelectedVehicleType() {
        if (carRadioButton.isSelected()) {
            return CAR;
        } else if (busRadioButton.isSelected()) {
            return BUS;
        } else {
            return TRUCK;
        }
    }

    private double calculateTax(Vehictype vehictype, int engineCapacity, int manufactureYear) {
        double yearMultiplier;

        if (manufactureYear <= 5) {
            yearMultiplier = 5;
        } else if (manufactureYear <= 10) {
            yearMultiplier = 4;
        } else if (manufactureYear <= 15) {
            yearMultiplier = 2;
        } else {
            yearMultiplier = 1;
        }

        switch (vehictype) {
            case CAR:
                return 18 * engineCapacity * yearMultiplier;
            case BUS:
                return 15 * engineCapacity * yearMultiplier;
            case TRUCK:
                return 16 * engineCapacity * yearMultiplier;
            default:
                return 0;
        }
    }
}
