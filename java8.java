// User-defined exception
class InvalidDaysException extends Exception {
    InvalidDaysException(String message) {
        super(message);
    }
}

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

    // Method with exception handling
    public void show(int days) throws InvalidDaysException {
        if (days <= 0) {
            throw new InvalidDaysException("Days must be greater than 0");
        }

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

        try {
            v.show(3);
        } catch (InvalidDaysException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        Vehicle.total();
    }
}