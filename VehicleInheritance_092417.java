class Vehicle {
    protected String model;
    protected int year;
    protected String color;

    public Vehicle(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String model, int year, String color, int numberOfDoors) {
        super(model, year, color);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println();
    }
}

class Motorcycle extends Vehicle {
    private double engineCapacity;

    public Motorcycle(String model, int year, String color, double engineCapacity) {
        super(model, year, color);
        this.engineCapacity = engineCapacity;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
        System.out.println();
    }
}

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String model, int year, String color, double loadCapacity) {
        super(model, year, color);
        this.loadCapacity = loadCapacity;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println();
    }
}

public class VehicleInheritance {
    public static void main(String[] args) {
        Car car = new Car("Civic", 2022, "White", 4);
        car.displayDetails();

        Motorcycle motorcycle = new Motorcycle("Honda Cd", 2011, "Red", 650);
        motorcycle.displayDetails();

        Truck truck = new Truck("Ford F-16", 2020, "Black", 2.5);
        truck.displayDetails();
    }
}
