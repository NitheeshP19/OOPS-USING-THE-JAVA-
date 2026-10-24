class Vehicle {
    private String name;
    static int count = 0;

    // Constructor
    Vehicle(String n) {
        name = n;
        count++;
    }

    // Normal method
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

class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Creta");

        v.show();
        v.show(3);

        Vehicle.total();
    }
}