package com.ecoridemanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of AlternativeEnergyCar objects
        List<AlternativeEnergyCar> cars = new ArrayList<>();
        cars.add(new TeslaModelS());
        cars.add(new NissanLeaf());
        cars.add(new ToyotaPrius());
        cars.add(new HondaAccordHybrid());

        // Print cars before sorting
        System.out.println("Cars before sorting:");
        for (AlternativeEnergyCar car : cars) {
            System.out.println(car);
        }

        // Sort the cars by price
        Collections.sort(cars);

        // Print cars after sorting
        System.out.println("\nCars after sorting by price:");
        for (AlternativeEnergyCar car : cars) {
            System.out.println(car);
        }
    }
}