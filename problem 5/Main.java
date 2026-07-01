
import java.util.Scanner;

class Vehicle {
    public String startEngine() {
        return "Vehicle engine started";
    }
}

class Car extends Vehicle {
    @Override
    public String startEngine() {
        return "Car engine roars";
    }
}

class Motorcycle extends Vehicle {
    @Override
    public String startEngine() {
        return "Motorcycle engine revs";
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Choose vehicle type:");
            System.out.println("1. Car");
            System.out.println("2. Motorcycle");
            System.out.print("Your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    vehicles[i] = new Car();
                    break;
                case 2:
                    vehicles[i] = new Motorcycle();
                    break;
                default:
                    System.out.println("Invalid choice! Defaulting to Car.");
                    vehicles[i] = new Car();
            }
        }

        System.out.println("\n--- Engine Status ---");

        for (Vehicle v : vehicles) {
            System.out.println(v.startEngine());
        }

        sc.close();
    }
}