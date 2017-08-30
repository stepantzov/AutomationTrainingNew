package training.collections.compare;

import java.util.LinkedList;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
class LinkedListFill {
    static LinkedList <Integer> doLinkedListFill(int elementsArray[]) {
        //LinkedList <Integer> myLinkedList = new LinkedList<Integer>();
        LinkedList newLinkedList = new LinkedList (CollectionFill.doBasicCollectionCreation(elementsArray));
       /* for (int j = 0; j < elementsArray.length; j++) {
            myLinkedList.add(j, elementsArray[j]);
        }*/
        return newLinkedList;
    }


}