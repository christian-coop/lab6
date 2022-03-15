import java.util.Scanner;

public class Lab6 {

    public static void main(String [] args) {

        int userNum1;
        int userNum2;
        int result;
        Scanner scnr = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        userNum1 = scnr.nextInt();
        System.out.print("Please enter the second number: ");
        userNum2 = scnr.nextInt();

        result = userNum1 + userNum2;

        System.out.println();
        System.out.print("Your result is: " + result);

    }
}
