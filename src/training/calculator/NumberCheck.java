package training.calculator;

/**
 * Created by Ivan_Stepantsov on 7/16/2017.
 */
class NumberCheck {
    void numberCheckOutput(int numberToCheck) {
        System.out.println("prime = " + numberPrime(numberToCheck));
        System.out.println("odd number = " + numberEven(numberToCheck));
    }

    boolean numberPrime(int number) {
        boolean primeFlag = false;

        if (number > 0) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return primeFlag;
                }
            }
            primeFlag = true;
        }
        return primeFlag;
    }

    boolean numberEven(int number) {
        boolean oddFlag = true;
        if (number % 2 == 0) {
            oddFlag = false;
        }
        return oddFlag;
    }
}