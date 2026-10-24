import java.util.Scanner;

// Abstract class
abstract class Vehicle {
    private String name;
    static int count = 0;

    // Constructor
    Vehicle(String n) {
        name = n;
        count++;
    }

    // Display vehicle name
    public void show() {
        System.out.println("The vehicle name: " + name);
    }

    // Method overloading
    public void show(int days) {
        System.out.println("How many days: " + days);
    }

    // Abstract method
    abstract void start();

    // Static method
    static void total() {
        System.out.println("How many vehicles: " + count);
    }
}

// Child class
class Car extends Vehicle {

    Car(String n) {
        super(n);
    }

    // Implementing abstract method
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }

    void displayCar() {
        System.out.println("This is a Car.");
    }
}

// Multilevel inheritance
class SportsCar extends Car {

    SportsCar(String n) {
        super(n);
    }

    void displaySportsCar() {
        System.out.println("This is a Sports Car.");
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        SportsCar s = new SportsCar(name);

        s.start();
        s.displayCar();
        s.displaySportsCar();
        s.show();
        s.show(days);

        Vehicle.total();

        sc.close();
    }
}