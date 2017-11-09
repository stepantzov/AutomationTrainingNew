package training.calculator;

/**
 * Created by Ivan_Stepantsov on 7/16/2017.
 */
public class NumberCheck {
    static void numberCheckOutput(int numberToCheck) {
        System.out.println("prime = " + numberPrime(numberToCheck));
        System.out.println("odd number = " + numberEven(numberToCheck));
    }

  public static boolean numberPrime(int number) {
        boolean primeFlag = false;

        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return primeFlag;
                }
            }
            primeFlag = true;
        }
        return primeFlag;
    }

   public static boolean numberEven(int number) {
        boolean oddFlag = true;
        if (number % 2 == 0) {
            oddFlag = false;
        }
        return oddFlag;
    }
}