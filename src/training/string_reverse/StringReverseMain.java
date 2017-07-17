package training.string_reverse;

import java.util.Scanner;
/**
 * Created by Ivan_Stepantsov on 7/16/2017.
 */
public class StringReverseMain {
    public static void main(String[] args) {
        String inputString;
        System.out.println("Please enter your string to reverse:");
        Scanner stringToReverse = new Scanner(System.in);
        inputString = stringToReverse.nextLine();
        char[] singleCharacter = inputString.toCharArray();

        for (int i = singleCharacter.length - 1; i >= 0; i--) {
            System.out.print(singleCharacter[i]);
        }
    }
}
