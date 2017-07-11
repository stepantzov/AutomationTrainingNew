/**
 * Created by Ivan_Stepantsov on 7/3/2017.
 */

package training.numbers_compare;
import java.util.Scanner;

/**
 * This class compares two numbers
 * with his name added
 * */

public class TwoNumbersCompare {
    public TwoNumbersCompare(double numberOne, double numberTwo){
        if (numberOne == numberTwo) {
            System.out.println("Your numbers are equal.");
        } else if (numberOne > numberTwo) {
            System.out.println("number " + numberOne + " is greater than " + numberTwo);
        } else {
            System.out.println("number " + numberTwo + " is greater than " + numberOne);
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter first number (0-9):");
        Scanner numberScanner = new Scanner(System.in);
        double numberOne = numberScanner.nextDouble();
        System.out.println("Please enter second number (0-9):");
        double numberTwo = numberScanner.nextDouble();

        if ((numberOne % 1 != 0) || (numberTwo % 1 != 0)) {
            throw new IllegalArgumentException("You entered not a numbers!");
        } else {
            new TwoNumbersCompare (numberOne, numberTwo);
        }
    }
}