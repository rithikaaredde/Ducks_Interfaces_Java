// Main.java
// Name: Rithikaa Redde
// PRN: 23070126101
// Batch: B1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for reading user input.
        Scanner scanner = new Scanner(System.in);

        // Display the duck selection menu.
        System.out.println("Select a Duck to see its behavior:");
        System.out.println("1. Mallard Duck");
        System.out.println("2. Red Head Duck");
        System.out.println("3. Rubber Duck");
        System.out.println("4. Decoy Duck");
        System.out.println("5. Model Duck");
        System.out.print("Enter your choice (1-5): ");

        int choice = scanner.nextInt();
        Duck duck = null;

        // Instantiate the chosen duck type.
        switch (choice) {
            case 1:
                duck = new MallardDuck();
                break;
            case 2:
                duck = new RedHeadDuck();
                break;
            case 3:
                duck = new RubberDuck();
                break;
            case 4:
                duck = new DecoyDuck();
                break;
            case 5:
                duck = new ModelDuck();
                break;
            default:
                System.out.println("Invalid choice! Exiting...");
                System.exit(0);
        }

        // Display duck information and perform its behaviors.
        duck.display();
        duck.performSwim();
        duck.performFly();

        // Close the scanner.
        scanner.close();
    }
}
