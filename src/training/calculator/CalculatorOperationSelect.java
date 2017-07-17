package training.calculator;

/**
 * Created by Ivan_Stepantsov on 7/16/2017.
 */
class CalculatorOperationSelect {
    CalculatorOperationSelect(String operationSelect) {
        int result;
        int operandOne;
        int operandTwo;

        ValuesScanner valuesScanner = new ValuesScanner();
        operandOne = valuesScanner.getFirstValueSelected();
        operandTwo = valuesScanner.getSecondValueSelected();

        switch (operationSelect) {
            case "1":
                BasicOperationsScope addOperation = new BasicOperationsScope();
                result = addOperation.addOperationCalc(operandOne, operandTwo);
                System.out.format("%d + %d = %d ", operandOne, operandTwo, result);
                break;

            case "2":
                BasicOperationsScope subtractionOperation = new BasicOperationsScope();
                result = subtractionOperation.subtractionOperationCalc(operandOne, operandTwo);
                System.out.format("%d - %d = %d ", operandOne, operandTwo, result);
                break;

            case "3":
                BasicOperationsScope multiplicationOperation = new BasicOperationsScope();
                result = multiplicationOperation.multiplicationOperationCalc(operandOne, operandTwo);
                System.out.format("%d * %d = %d ", operandOne, operandTwo, result);
                break;

            case "4":
                BasicOperationsScope divisionOperation = new BasicOperationsScope();
                result = divisionOperation.divisionOperationCalc(operandOne, operandTwo);
                System.out.format("%d / %d = %d ", operandOne, operandTwo, result);
                break;

            case "5":
                BasicOperationsScope reminderOperation = new BasicOperationsScope();
                result = reminderOperation.reminderOperationCalc(operandOne, operandTwo);
                System.out.format("reminder of %d and %d = " + result, operandOne, operandTwo);
                break;

            default:
                System.out.println("Invalid operation.");
                break;
        }
    }
}
