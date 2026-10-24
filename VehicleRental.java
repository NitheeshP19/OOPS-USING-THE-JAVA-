import java.util.Scanner;

class Vehicle {
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

    // Method Overloading
    public void show(int days) {
        System.out.println("How many days: " + days);
    }

    // Static method
    static void total() {
        System.out.println("How many vehicles: " + count);
    }
}

class Car extends Vehicle {

    // Constructor
    Car(String n) {
        super(n);
    }

    void display() {
        System.out.println("This is a Car.");
    }

    // Method Overriding
    @Override
    public void show() {
        super.show();
        System.out.println("This method is overridden in Car class.");
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        Car c = new Car(name);

        c.display();
        c.show();
        c.show(days);

        Vehicle.total();

        sc.close();
    }
}