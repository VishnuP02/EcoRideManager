package com.ecoridemanager;

public class AlternativeEnergyCar implements Comparable<AlternativeEnergyCar> {
    private String brand;
    private String model;
    private double price;
    private int range; // in miles
    private String energyType; // e.g., Electric, Hybrid

    // Constructor
    public AlternativeEnergyCar(String brand, String model, double price, int range, String energyType) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.range = range;
        this.energyType = energyType;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getEnergyType() {
        return energyType;
    }

    public void setEnergyType(String energyType) {
        this.energyType = energyType;
    }

    // toString Method
    @Override
    public String toString() {
        return "Brand: " + brand +
                ", Model: " + model +
                ", Price: $" + price +
                ", Range: " + range + " miles" +
                ", Energy Type: " + energyType;
    }

    // compareTo Method for Sorting by Price
    @Override
    public int compareTo(AlternativeEnergyCar otherCar) {
        return Double.compare(this.price, otherCar.price);
    }
}