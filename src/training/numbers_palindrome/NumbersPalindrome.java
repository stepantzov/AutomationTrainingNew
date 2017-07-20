package training.numbers_palindrome;

import java.util.Scanner;

/**
 * Created by Ivan_Stepantsov on 7/10/2017.
 */
class NumbersPalindrome {
    void numbersPalindrome() {
        boolean palindromeFlag;

        System.out.println("Please enter your number to check if palindrome: ");
        Scanner numberToCheckScan = new Scanner(System.in);
        int numberToCheck = numberToCheckScan.nextInt();
        NumbersPalindromeLogic checkNumbersPalindromeLogic = new NumbersPalindromeLogic();

        palindromeFlag = checkNumbersPalindromeLogic.numbersPalindromeLogic(numberToCheck);
        if (palindromeFlag) {
            System.out.println("Your number is palindrome.");
        } else System.out.println("Your number is not a palindrome.");
    }


}