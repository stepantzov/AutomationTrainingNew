package training.calculator;

import java.util.Scanner;

/**
 * Created by Ivan_Stepantsov on 7/16/2017.
 */
class ValuesScanner {
    Scanner valuesScanner = new Scanner(System.in);

    int getFirstValueSelected() {
        System.out.println("Please enter first value: ");
        int getFirstValueSelected = valuesScanner.nextInt();
        return getFirstValueSelected;
    }

    int getSecondValueSelected() {
        System.out.println("Please enter second value: ");
        int secondValueSelected = valuesScanner.nextInt();
        return secondValueSelected;
    }

}