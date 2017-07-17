package training.calculator;


/**
 * Created by Ivan_Stepantsov on 7/16/2017.
 */
class NumberCheckLogic {
    boolean numberPrimeCheck(int number) {
        boolean primeFlag;

        if (number > 0) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    primeFlag = false;
                    return primeFlag;
                }
            }
            primeFlag = true;
            return primeFlag;
        } else primeFlag = false;
        return primeFlag;
    }

    boolean numberEvenCheck(int number) {
        boolean oddFlag;
        if (number % 2 == 0) {
            oddFlag = false;
            return oddFlag;
        } else {
            oddFlag = true;
            return oddFlag;
        }
    }
}