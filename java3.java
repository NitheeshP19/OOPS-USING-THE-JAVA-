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

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        Vehicle v = new Vehicle(name);

        v.show();
        v.show(days);

        Vehicle.total();

        sc.close();
    }
}