package training.string;

import java.util.Scanner;

/**
 * Created by Ivan_Stepantsov on 7/17/2017.
 */

public class StringIntConverter {
    public static int doStringConvert() {
        System.out.println("Please enter String to convert to Int:");
        Scanner enteredStringScanner = new Scanner(System.in);
        String enteredString = enteredStringScanner.nextLine();
        int intCapture = Integer.parseInt(enteredString);
        return intCapture;
    }

    public static String doIntConvert() {
        System.out.println("Please enter Int to convert to String:");
        Scanner enteredIntScanner = new Scanner(System.in);
        int enteredInt = enteredIntScanner.nextInt();
        String stringCapture = String.valueOf(enteredInt);
        return stringCapture;
    }

    public static class convertSwitch {
        public static void doConvert() {
            System.out.println("Please select the operation with string required:\n " +
                    "1 Convert from String to Int\n 2 Convert from Int to String");
            Scanner myScanner = new Scanner(System.in);
            switch (myScanner.nextInt()) {
                case 1: {
                    System.out.println(StringIntConverter.doStringConvert());
                    break;
                }
                case 2: {
                    System.out.println(StringIntConverter.doIntConvert());
                    break;
                }
                default: {
                    System.out.println("Invalid operation.");
                }
            }
        }
    }

    public static void main(String[] args) {
        convertSwitch.doConvert();
    }
}