package com.example.vehicletaxcalculator;

public abstract class Vehicle {
    private int engineCapacity;
    private int manufactureYear;
    private Vehictype vehicleType;

    public Vehicle(int engineCapacity, int manufactureYear, Vehictype vehicleType) {
        this.engineCapacity = engineCapacity;
        this.manufactureYear = manufactureYear;
        this.vehicleType = vehicleType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public Vehictype getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehictype vehicleType) {
        this.vehicleType = vehicleType;
    }

    public abstract double calculateTax(); // Abstract method to calculate tax
    // 220104033: Aizirek : Ibraimova
}

