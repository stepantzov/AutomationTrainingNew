package training.calculator;

/**
 * Created by Ivan_Stepantsov on 7/16/2017.
 */
class BasicCalculatorOperations {
    int result;
    int operandOne;
    int operandTwo;

    int addOperation(int operandOne, int operandTwo) {
        return (operandOne + operandTwo);
    }

    int subtractionOperation(int operandOne, int operandTwo) {
        return (operandOne - operandTwo);
    }

    int multiplicationOperation(int operandOne, int operandTwo) {
        return (operandOne * operandTwo);
    }

    int divisionOperation(int operandOne, int operandTwo) {
        return (operandOne / operandTwo);
    }

    int reminderOperation(int operandOne, int operandTwo) {
        return (operandOne % operandTwo);
    }

    BasicCalculatorOperations(String operationSelect) {
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
