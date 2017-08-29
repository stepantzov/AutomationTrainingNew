package training.calculator;

import training.string.*;

import java.util.Scanner;

/**
 * Created by Ivan_Stepantsov on 7/8/2017.
 */
public class CalculatorMain {
    static int getSelectedValue(String value) {
        Scanner valuesScanner = new Scanner(System.in);
        System.out.format("Please enter %s value: ", value);
        return valuesScanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the text Calculator.\nPlease select the number below which " +
                "is correspond to the operation needed.");
        System.out.println("If you need to check if your number is prime, odd or even - please enter " +
                "engineer mode, just typing 'eng' in console.");
        System.out.println("If you want to use String Converter or reverse the string " +
                "please type 'str' in console.");
        System.out.println("1 addition\n2 subtraction\n3 multiply\n4 division\n5 modulus(%)\n");

        Scanner operationTypeScanner = new Scanner(System.in);
        String operationTypeSelect = operationTypeScanner.nextLine();

        if (operationTypeSelect.equals("eng")) {
            System.out.println("You've entered engineer mode. Please enter number to check:");
            Scanner numberToCheckScanner = new Scanner(System.in);
            int numberToCheckValue = numberToCheckScanner.nextInt();
            NumberCheck myNumberToCheck = new NumberCheck();
            myNumberToCheck.numberCheckOutput(numberToCheckValue);
        }
        if (operationTypeSelect.equals("str")) {
            System.out.println("Please select the needed operation:\n1 String to int convert.\n2 String reverse.\n");
            Scanner stringOperationSelect = new Scanner(System.in);
            switch (stringOperationSelect.nextInt()) {
                case 1:
                    StringIntConverter.convertSwitch.doConvert();
                    break;
                case 2:
                    System.out.println(StringReverse.returnResultString());
                    break;
            }
        } else {
            new BasicCalculatorOperations(operationTypeSelect);
        }
    }
}