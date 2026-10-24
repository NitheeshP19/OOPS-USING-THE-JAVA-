import java.util.ArrayList;
import java.util.Collections;

// Interface defining vehicle actions
interface Rentable {
    void rent();
    void returnVehicle();
}

// Vehicle class implementing Rentable and Comparable
class Vehicle implements Rentable, Comparable<Vehicle> {
    private String name;
    private double rentPerDay;
    static int count = 0;

    // Parameterized constructor
    Vehicle(String name, double rentPerDay) {
        this.name = name;
        this.rentPerDay = rentPerDay;
        count++;
    }

    public String getName() {
        return name;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    @Override
    public void rent() {
        System.out.println(name + " has been rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println(name + " has been returned.");
    }

    @Override
    public int compareTo(Vehicle other) {
        return Double.compare(this.rentPerDay, other.rentPerDay);
    }

    public void show() {
        System.out.println("Vehicle: " + name + " | Rent/Day: Rs. " + rentPerDay);
    }

    static void total() {
        System.out.println("Total vehicles: " + count);
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Vehicle("Creta", 2500));
        vehicles.add(new Vehicle("Swift", 1500));
        vehicles.add(new Vehicle("Thar", 3500));

        System.out.println("--- All Vehicles ---");
        for (Vehicle v : vehicles) {
            v.show();
        }

        System.out.println("\n--- Sorting by Rent ---");
        Collections.sort(vehicles);
        for (Vehicle v : vehicles) {
            v.show();
        }

        System.out.println("\n--- Interface Operations ---");
        vehicles.get(0).rent();
        vehicles.get(0).returnVehicle();

        System.out.println();
        Vehicle.total();
    }
}
