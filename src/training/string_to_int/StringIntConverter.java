package training.string_to_int;

import java.util.Scanner;

/**
 * Created by Ivan_Stepantsov on 7/17/2017.
 */
public class StringIntConverter {
    public static void main(String[] args) {
        System.out.println("Please select the operation required:\n " +
                "1 Convert from String to Int\n 2 Convert from Int to String");
        Scanner myScanner = new Scanner(System.in);
        int i = myScanner.nextInt();
        switch (i) {
            case 1: {
                System.out.println("Please enter String to convert to Int:");
                Scanner enteredStringScanner = new Scanner(System.in);
                String enteredString = enteredStringScanner.nextLine();
                int intCapture = Integer.parseInt(enteredString);
                System.out.println(intCapture);
                break;
            }
            case 2: {
                System.out.println("Please enter Int to convert to String:");
                Scanner enteredIntScanner = new Scanner(System.in);
                int enteredInt = enteredIntScanner.nextInt();
                String stringCapture = String.valueOf(enteredInt);
                System.out.println(stringCapture);
                break;
            }
        }
    }
}