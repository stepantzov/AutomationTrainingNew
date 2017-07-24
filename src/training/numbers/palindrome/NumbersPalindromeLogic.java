package training.numbers.palindrome;

/**
 * Created by Ivan_Stepantsov on 7/16/2017.
 */
class NumbersPalindromeLogic {
    boolean getPalindromeFlag(int number) {
        int n;
        int digit;
        int reverse = 0;
        n = number;

        do {
            digit = number % 10;
            reverse = (reverse * 10) + digit;
            number = number / 10;
        }
        while (number != 0);
        return (n == reverse);
    }
}