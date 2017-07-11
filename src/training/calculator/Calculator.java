package training.calculator;

import java.util.Scanner;

/**
 * Created by Ivan_Stepantsov on 7/8/2017.
 */
public class Calculator {
    private Calculator(String operationSelect) {
        int result;
        int operandOne;
        int operandTwo;

        ValuesScanner valuesScanner = new ValuesScanner();
        operandOne = valuesScanner.getFirstValueSelected();
        operandTwo = valuesScanner.getSecondValueSelected();

        switch (operationSelect) {
            case "+":
                BasicOperationsScope addOperation = new BasicOperationsScope();
                result = addOperation.addOperationCalc(operandOne, operandTwo);
                System.out.format("%d + %d = %d ", operandOne, operandTwo, result);
                break;

            case "-":
                BasicOperationsScope subtractionOperation = new BasicOperationsScope();
                result = subtractionOperation.subtractionOperationCalc(operandOne, operandTwo);
                System.out.format("%d - %d = %d ", operandOne, operandTwo, result);
                break;

            case "*":
                BasicOperationsScope multiplicationOperation = new BasicOperationsScope();
                result = multiplicationOperation.multiplicationOperationCalc(operandOne, operandTwo);
                System.out.format("%d * %d = %d ", operandOne, operandTwo, result);
                break;

            case "/":
                BasicOperationsScope divisionOperation = new BasicOperationsScope();
                result = divisionOperation.divisionOperationCalc(operandOne, operandTwo);
                System.out.format("%d / %d = %d ", operandOne, operandTwo, result);
                break;

            case "%":
                BasicOperationsScope reminderOperation = new BasicOperationsScope();
                result = reminderOperation.reminderOperationCalc(operandOne, operandTwo);
                System.out.format("reminder of %d and %d = " + result, operandOne, operandTwo);
                break;
            default:
                System.out.println("INVALID OPERATION.");
        }
    }

    private class BasicOperationsScope {
        public int addOperationCalc(int operandOne, int operandTwo) {
            int addOperationResult = operandOne + operandTwo;
            return addOperationResult;
        }

        public int subtractionOperationCalc(int operandOne, int operandTwo) {
            int addOperationResult = operandOne - operandTwo;
            return addOperationResult;
        }

        public int multiplicationOperationCalc(int operandOne, int operandTwo) {
            int addOperationResult = operandOne * operandTwo;
            return addOperationResult;
        }

        public int divisionOperationCalc(int operandOne, int operandTwo) {
            int addOperationResult = operandOne / operandTwo;
            return addOperationResult;
        }

        public int reminderOperationCalc(int operandOne, int operandTwo) {
            int addOperationResult = operandOne % operandTwo;
            return addOperationResult;
        }
    }

    public class ValuesScanner {
        Scanner valuesScanner = new Scanner(System.in);

        public int getFirstValueSelected() {
            System.out.println("Please enter first value: ");
            int getFirstValueSelected = valuesScanner.nextInt();
            return getFirstValueSelected;
        }

        public int getSecondValueSelected() {
            System.out.println("Please enter second value: ");
            int secondValueSelected = valuesScanner.nextInt();
            return secondValueSelected;
        }

    }

    //https://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/
    public static class NumberCheckLogic {
        public boolean numberPrimeCheck(int number) {
            if (number > 0) {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0)
                        return false;
                }
                return true;
            } else return false;
        }

        public boolean numberEvenCheck(int number) {
            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static class NumberCheck {
        public void numberCheckOutput(int numberToCheck) {

            NumberCheckLogic mynumberCheckLogic = new NumberCheckLogic();
            mynumberCheckLogic.numberPrimeCheck(numberToCheck);

            if (mynumberCheckLogic.numberPrimeCheck(numberToCheck) == true) {
                System.out.println("Your number is PRIME");
            } else System.out.println("Your number is NOT PRIME");

            if (mynumberCheckLogic.numberEvenCheck(numberToCheck) == true) {
                System.out.println("You entered an even number.");
            } else System.out.println("You entered NOT an EVEN number.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter type of basic operations between the next: + - * / ");
        System.out.println("If you need to enter engineer mode please enter 'ENG'");

        Scanner operationTypeScanner = new Scanner(System.in);
        String operationTypeSelect = operationTypeScanner.nextLine();

        if (operationTypeSelect.equals("ENG")) {
            System.out.println("You've entered the ENGINEER mode.\nPlease enter your number to check:");
            Scanner numberToCheckScanner = new Scanner(System.in);
            int numberToCheckValue = numberToCheckScanner.nextInt();
            NumberCheck myNumberToCheck = new NumberCheck();
            myNumberToCheck.numberCheckOutput(numberToCheckValue);
        } else {

            new Calculator(operationTypeSelect);
        }
    }
}
