import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account("123456", "Abhi Kare", 5000);

        while (true) {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Show Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                acc.showDetails();
            } else if (choice == 2) {
                System.out.print("Enter amount: ");
                double amt = sc.nextDouble();
                acc.deposit(amt);
            } else if (choice == 3) {
                System.out.print("Enter amount: ");
                double amt = sc.nextDouble();
                acc.withdraw(amt);
            } else if (choice == 4) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Invalid Choice!");
            }
        }
        sc.close();
    }
}
