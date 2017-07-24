package training.string_reverse;

import java.util.Scanner;

/**
 * Created by Ivan_Stepantsov on 7/16/2017.
 */
public class StringReverseMain {
    static String getInputString() {
        String inputString;
        System.out.println("Please enter your string to reverse:");
        Scanner stringToReverse = new Scanner(System.in);
        inputString = stringToReverse.nextLine();
        return inputString;
    }

    public static void main(String[] args) {
        char[] characterArray = StringReverseMain.getInputString().toCharArray();

        for (int i = characterArray.length - 1; i >= 0; i--) {
            String resultString = Character.toString(characterArray[i]);
            System.out.print(resultString);
        }
    }
}