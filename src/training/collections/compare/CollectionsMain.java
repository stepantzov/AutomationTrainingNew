package training.collections.compare;

import java.util.Scanner;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
public class CollectionsMain {
    public static void main(String[] args) {
        System.out.println("Please enter the number of elements to add into collection:");
        Scanner elementsQuantityScanner = new Scanner(System.in);
        int elementsQuantity = elementsQuantityScanner.nextInt();
        int elementsArray [] = new int[elementsQuantity];
        for (int i = 0; i < elementsArray.length; i++) {
            elementsArray[i] = (int) Math.round((Math.random() * 100));
        }

        System.out.println("Map structure: \n" + BasicMapFill.myMapCreation(elementsArray));
        System.out.println("Collection structure: \n" + BasicCollectionsFill.doBasicCollectionCreation(elementsArray));
        BasicCollectionsFill.getMidElement(BasicCollectionsFill.doBasicCollectionCreation(elementsArray));
        ArrayListFill.getMidElement(ArrayListFill.doArrayListFill(elementsArray));
        LinkedListFill.getMidElement(LinkedListFill.doLinkedListFill(elementsArray));
        HashMapFill.getMidElement(HashMapFill.doHashMapFill(elementsArray));
    }
}