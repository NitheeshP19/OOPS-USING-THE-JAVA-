class Vehicle {
    String vehicleName;
    String vehicleType;
    double rentPerDay;

    // Default Constructor
    Vehicle() {
        vehicleName = "Not Available";
        vehicleType = "Unknown";
        rentPerDay = 0;
    }

    // Parameterized Constructor
    Vehicle(String name, String type, double rent) {
        vehicleName = name;
        vehicleType = type;
        rentPerDay = rent;
    }

    // Method to display vehicle details
    void displayDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Rent Per Day: Rs. " + rentPerDay);
    }
}

class Main {
    public static void main(String[] args) {

        // Object using the default constructor
        Vehicle v1 = new Vehicle();

        // Object using the parameterized constructor
        Vehicle v2 = new Vehicle("Hyundai Creta", "SUV", 2500);

        System.out.println("Vehicle 1 Details");
        v1.displayDetails();

        System.out.println();

        System.out.println("Vehicle 2 Details");
        v2.displayDetails();
    }
}