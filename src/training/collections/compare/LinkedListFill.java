package training.collections.compare;

import java.util.LinkedList;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
class LinkedListFill {
    static LinkedList<Integer> doLinkedListFill(int elementsArray[]) {
        LinkedList newLinkedList = new LinkedList(CollectionFill.doBasicCollectionCreation(elementsArray));
        return newLinkedList;
    }
}