import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("You are in Mr. Au's class and you must successfully survive. Select options by entering the corresponding number.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Start.");
        System.out.println("2. Quit.");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Good luck, you may now begin your experience in Mr. Au's class. Survive.");
        }
        else if(choice == 2){
            System.out.println("Goodbye.");
        }
        else {
            System.out.println("Sorry, this is not an option");
        }
    }

}