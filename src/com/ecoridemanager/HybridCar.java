package com.ecoridemanager;

public abstract class HybridCar extends AlternativeEnergyCar {
    private double fuelTankCapacity; // gallons

    public HybridCar(String brand, String model, double price, int range, String energyType, double fuelTankCapacity) {
        super(brand, model, price, range, energyType);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fuel Tank Capacity: " + fuelTankCapacity + " gallons";
    }
}