package training.calculator;

/**
 * Created by Ivan_Stepantsov on 7/16/2017.
 */
class NumberCheck {
    void numberCheckOutput(int numberToCheck) {
        NumberCheckLogic myNumberCheckLogic = new NumberCheckLogic();
        myNumberCheckLogic.numberPrimeCheck(numberToCheck);

        System.out.println("prime = " + myNumberCheckLogic.numberPrimeCheck(numberToCheck));
        System.out.println("odd number = " + myNumberCheckLogic.numberEvenCheck(numberToCheck));
    }
}