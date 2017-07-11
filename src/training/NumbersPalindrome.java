package training;

import java.util.Scanner;

/**
 * Created by Ivan_Stepantsov on 7/10/2017.
 */
public class NumbersPalindrome {
    private void numbersPalindrome() {
        boolean palindromeFlag;

        System.out.println("Please enter your number to check if palindrome: ");
        Scanner numberToCheckScan = new Scanner(System.in);
        int numberToCheck = numberToCheckScan.nextInt();

        NumbersPalindromeLogic checkNumbersPalindromeLogic = new NumbersPalindromeLogic();

        palindromeFlag = checkNumbersPalindromeLogic.numbersPalindromeLogic(numberToCheck);
        if (palindromeFlag) {
            System.out.println("Your number is palindrome!");
        } else System.out.println("Your number is NOT a palindrome!");
    }

    private class NumbersPalindromeLogic {
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

            if (n == reverse) return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        NumbersPalindrome myNumbersPalindrome = new NumbersPalindrome();
        myNumbersPalindrome.numbersPalindrome();
    }
}