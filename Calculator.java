import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("=== BasicCalc v2 ===\n"
                            +    "1. Add\n"
                            +    "2. Subtract\n"
                            +    "3. Multiply\n"
                            +    "4. Divide\n"
                            +    "5. Exit\n"
                            +    "Choose operation: ");

            int choice;
            try{
                choice = sc.nextInt();
            }

            catch(InputMismatchException e) {
                sc.next();
                continue;
            }


            switch (choice) {
                case 1:
                    System.out.println("You chose Add.");
                    break;
                case 2:
                    System.out.println("You chose Subtract.");
                    break;
                case 3:
                    System.out.println("You chose Multiply.");
                    break;
                case 4:
                    System.out.println("You chose Divide.");
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Choose 1-5.");
            }
        }
    }
}
