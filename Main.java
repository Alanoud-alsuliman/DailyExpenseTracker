import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Daily Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Show Total Expenses");
            System.out.println("4. Show Category Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Add Expense feature will be implemented later.");
                    break;
                case 2:
                    System.out.println("View Expenses feature will be implemented later.");
                    break;
                case 3:
                    System.out.println("Total Expenses feature will be implemented later.");
                    break;
                case 4:
                    System.out.println("Category Report feature will be implemented later.");
                    break;
                case 5:
                    System.out.println("Thank you for using Daily Expense Tracker.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        input.close();
    }
}