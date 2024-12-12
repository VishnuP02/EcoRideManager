package com.ecoridemanager;

public abstract class ElectricCar extends AlternativeEnergyCar {
    private double batteryCapacity; // kWh

    public ElectricCar(String brand, String model, double price, int range, String energyType, double batteryCapacity) {
        super(brand, model, price, range, energyType);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Battery Capacity: " + batteryCapacity + " kWh";
    }
}