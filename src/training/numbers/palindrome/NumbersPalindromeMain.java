package training.numbers.palindrome;

import java.util.Scanner;

/**
 * Created by Ivan_Stepantsov on 7/16/2017.
 */
public class NumbersPalindromeMain {
    void displayPalindromeResults() {
        System.out.println("Please enter your number to check if it's a palindrome: ");
        Scanner numberToCheckScan = new Scanner(System.in);
        int numberToCheck = numberToCheckScan.nextInt();
        NumbersPalindromeLogic checkNumbersPalindromeLogic = new NumbersPalindromeLogic();

        boolean palindromeFlag = checkNumbersPalindromeLogic.getPalindromeFlag(numberToCheck);
        System.out.format("palindrome = %b;", palindromeFlag);
    }

    public static void main(String[] args) {
        NumbersPalindromeMain myNumbersPalindrome = new NumbersPalindromeMain();
        myNumbersPalindrome.displayPalindromeResults();
    }
}