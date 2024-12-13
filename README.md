# EcoRideManager: CIS111B Final Exam Project

## Description
**EcoRideManager** is a Java-based project designed to demonstrate fundamental object-oriented programming (OOP) principles such as inheritance, polymorphism, and interfaces. This project was developed as part of the CIS111B Final Exam to meet specific requirements involving abstract classes, concrete subclasses, and implementing sorting through the `Comparable` interface.

## Features
- **Abstract Classes**: `ElectricCar` and `HybridCar` extend the base class `AlternativeEnergyCar`.
- **Concrete Subclasses**: Implements specific car models:
  - `TeslaModelS`
  - `NissanLeaf`
  - `ToyotaPrius`
  - `HondaAccordHybrid`
- **Polymorphism**: Demonstrated by using the parent class reference to point to subclass objects.
- **Sorting**: Cars are sorted by price using the `Comparable` interface and `Collections.sort()`.

## Project Structure
The project contains the following files:

### 1. **Classes**
- `AlternativeEnergyCar.java`: Base class implementing `Comparable` and containing core properties such as `brand`, `model`, `price`, `range`, and `energyType`.
- `ElectricCar.java`: Abstract subclass representing electric cars, introducing a unique field `batteryCapacity`.
- `HybridCar.java`: Abstract subclass representing hybrid cars, introducing a unique field `fuelTankCapacity`.
- Concrete Subclasses:
  - `TeslaModelS.java`
  - `NissanLeaf.java`
  - `ToyotaPrius.java`
  - `HondaAccordHybrid.java`

### 2. **Driver Program**
- `Main.java`: Contains the `main()` method to demonstrate:
  - Polymorphism by iterating over a list of `AlternativeEnergyCar` references.
  - Sorting functionality by price using the `compareTo()` method.

## Usage
### Run the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/YourGitHubUsername/EcoRideManager.git
