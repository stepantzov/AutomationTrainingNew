package training.numbers_palindrome;

/**
 * Created by Ivan_Stepantsov on 7/16/2017.
 */
class NumbersPalindromeLogic {
    boolean numbersPalindromeLogic(int number) {
        int n;
        int digit;
        int reverse = 0;
        n = number;

        do {
            digit = number % 10;
            reverse = (reverse * 10) + digit;
            number = number / 10;
        } while (number != 0);

        if (n == reverse) {
            return true;
        } else {
            return false;
        }
    }
}