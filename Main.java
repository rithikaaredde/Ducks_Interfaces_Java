// Name: Rithikaa Redde
// PRN: 23070126101
// Batch: B1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Duck duck;

        while (true) {
            System.out.println("\nSelect a Duck to see its behavior:");
            System.out.println("1. Mallard Duck");
            System.out.println("2. Red Head Duck");
            System.out.println("3. Rubber Duck");
            System.out.println("4. Decoy Duck");
            System.out.println("5. Model Duck");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            int choice = scanner.nextInt();

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
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    continue;
            }

            duck.display();
            duck.performSwim();
            duck.performFly();
        }
    }
}
