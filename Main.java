import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Expense> expenses = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
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
            input.nextLine();

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    System.out.println("View Expenses feature will be checked later.");
                    break;
                case 3:
                    showTotalExpenses();
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

    public static void addExpense() {
        System.out.print("Enter amount: ");
        double amount = input.nextDouble();
        input.nextLine();

        System.out.print("Enter category (Food / Transport / Entertainment): ");
        String category = input.nextLine();

        System.out.print("Enter description: ");
        String description = input.nextLine();

        System.out.print("Enter date: ");
        String date = input.nextLine();

        Expense expense = new Expense(amount, category, description, date);
        expenses.add(expense);

        System.out.println("Expense added successfully.");
    }

    public static void showTotalExpenses() {
        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        System.out.println("Total Expenses: " + total);
    }
}