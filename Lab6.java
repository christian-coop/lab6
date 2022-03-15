import java.util.Scanner;

public class Lab6 {

    public static void main(String [] args) {

        int userNum1;
        int userNum2;
        int result = 0;
        int option;
        Scanner scnr = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println();
        System.out.print("Select an option: ");
        option = scnr.nextInt();

        System.out.println();
        System.out.print("Please enter the first number: ");
        userNum1 = scnr.nextInt();
        System.out.print("Please enter the second number: ");
        userNum2 = scnr.nextInt();

        if (option == 1) {
            result = userNum1 + userNum2;
        } else if (option == 2) {
            result = userNum1 - userNum2;
        }

        System.out.println();
        System.out.println("Your result is: " + result);

    }
}
