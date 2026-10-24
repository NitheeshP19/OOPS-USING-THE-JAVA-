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

    // Method overloading
    public void show(int days) {
        System.out.println("How many days: " + days);
    }

    // Static method
    static void total() {
        System.out.println("How many vehicles: " + count);
    }
}

// Thread class
class VehicleThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running.");
    }
}

class Main {
    public static void main(String[] args) {

        Vehicle v = new Vehicle("Creta");

        v.show();
        v.show(3);

        Vehicle.total();

        // Creating and starting the thread
        VehicleThread t = new VehicleThread();
        t.start();
    }
}