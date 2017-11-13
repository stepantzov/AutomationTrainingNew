package training.calculator;

/**
 * Created by Ivan_Stepantsov on 7/16/2017.
 */
public class BasicCalculatorOperations {
    int result;
    int operandOne;
    int operandTwo;

    public BasicCalculatorOperations() {} //to ease test process;

    public static int addOperation(int operandOne, int operandTwo) {
        return (operandOne + operandTwo);
    }

    public static int subtractionOperation(int operandOne, int operandTwo) {
        return (operandOne - operandTwo);
    }

    public static int multiplicationOperation(int operandOne, int operandTwo) {
        return (operandOne * operandTwo);
    }

    public static int divisionOperation(int operandOne, int operandTwo) {
        return (operandOne / operandTwo);
    }

    public static int reminderOperation(int operandOne, int operandTwo) {
        return (operandOne % operandTwo);
    }


    public BasicCalculatorOperations(String operationSelect) {
        operandOne = CalculatorMain.getSelectedValue("first");
        operandTwo = CalculatorMain.getSelectedValue("second");

        switch (operationSelect) {
            case "1":
                result = addOperation(operandOne, operandTwo);
                System.out.format("%d + %d = %d ", operandOne, operandTwo, result);
                break;

            case "2":
                result = subtractionOperation(operandOne, operandTwo);
                System.out.format("%d - %d = %d ", operandOne, operandTwo, result);
                break;

            case "3":
                result = multiplicationOperation(operandOne, operandTwo);
                System.out.format("%d * %d = %d ", operandOne, operandTwo, result);
                break;

            case "4":
                result = divisionOperation(operandOne, operandTwo);
                System.out.format("%d / %d = %d ", operandOne, operandTwo, result);
                break;

            case "5":
                result = reminderOperation(operandOne, operandTwo);
                System.out.format("reminder of %d and %d = " + result, operandOne, operandTwo);
                break;

            default:
                System.out.println("Invalid operation.");
                break;
        }
    }
}