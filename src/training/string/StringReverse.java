package training.string;

import java.util.Scanner;

/**
 * Created by Ivan_Stepantsov on 7/16/2017.
 */
public class StringReverse {
    public static String getInputString() {
        String inputString;
        System.out.println("Please enter your string to reverse:");
        Scanner stringToReverse = new Scanner(System.in);
        inputString = stringToReverse.nextLine();
        return inputString;
    }

    public static String returnResultString() {
        char[] characterArray = StringReverse.getInputString().toCharArray();
        String resultString = "";
        for (int i = characterArray.length - 1; i >= 0; i--) {
            resultString = (resultString + characterArray[i]);
        }
        return resultString;
    }

    public static void main(String[] args) {
        System.out.println(StringReverse.returnResultString());
    }
}