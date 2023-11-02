package com.example.vehicletaxcalculator;

public class Car extends Vehicle {
    public Car(int engineCapacity, int manufactureYear) {
        super(engineCapacity, manufactureYear, Vehictype.CAR);
    }

    @Override
    public double calculateTax() {
        int yearMultiplier;
        if (getManufactureYear() <= 5) {
            yearMultiplier = 5;
        } else if (getManufactureYear() <= 10) {
            yearMultiplier = 4;
        } else if (getManufactureYear() <= 15) {
            yearMultiplier = 2;
        } else {
            yearMultiplier = 1;
        }
        return 18 * getEngineCapacity() * yearMultiplier;
    }
}




