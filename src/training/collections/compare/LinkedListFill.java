package training.collections.compare;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
public class LinkedListFill extends BasicCollectionsFill {
    static LinkedList doLinkedListFill(int elementsArray []) {
        int elementsSequence[] = elementsArray;
        LinkedList myLinkedList = new LinkedList();
            for (int j = 0; j < elementsSequence.length; j++) {
                myLinkedList.add(j, elementsSequence[j]);
            }
        return myLinkedList;
    }

    static void getMidElement(LinkedList myLinkedList) {
        long startTime = System.nanoTime();
        if ((myLinkedList.size()) % 2 == 0) {
            System.out.format("\nLinkedList mid elements are: %d\n",myLinkedList.get(myLinkedList.size() / 2),
                    myLinkedList.get((myLinkedList.size() / 2) - 1));
        } else {
            System.out.format("LinkedList mid element is: %d\n", myLinkedList.get((myLinkedList.size() / 2) - 1));
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList operation time = " + duration);
    }
}
