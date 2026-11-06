import java.util.Scanner;

public class App {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Vehicle Management System");
            System.out.println("1. Register Truck");
            System.out.println("2. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    truckInformation();
                    break;
                case 2:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }

    public static void truckInformation() {
        boolean running = true;
        Truck v = new Truck();

        while (running) {
            System.out.println("Truck Information");
            System.out.println("1. Save Truck");
            System.out.println("2. Display Truck");
            System.out.println("3. Back");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    v.save();
                    break;
                case 2:
                    v.display();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}