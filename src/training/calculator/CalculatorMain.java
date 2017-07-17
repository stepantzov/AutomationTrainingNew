package training.calculator;

import java.util.Scanner;

/**
 * Created by Ivan_Stepantsov on 7/8/2017.
 */
public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the text Calculator.\nPlease select the number which " +
                "is correspond to the operation needed:\n" +
                "1 addition\n2 subtraction\n3 multiply\n4 division\n5 modulus(%)\n");
        System.out.println("If you need to check if your number is prime, odd or even - please enter " +
                "engineer mode, just typing 'eng' in console.");

        Scanner operationTypeScanner = new Scanner(System.in);
        String operationTypeSelect = operationTypeScanner.nextLine();

        if (operationTypeSelect.equals("eng")) {
            System.out.println("You've entered engineer mode. Please enter number to check:");
            Scanner numberToCheckScanner = new Scanner(System.in);
            int numberToCheckValue = numberToCheckScanner.nextInt();
            NumberCheck myNumberToCheck = new NumberCheck();
            myNumberToCheck.numberCheckOutput(numberToCheckValue);
        } else {
            new CalculatorOperationSelect(operationTypeSelect);
        }
    }
}
