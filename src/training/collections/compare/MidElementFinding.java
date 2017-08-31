package training.collections.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Ivan_Stepantsov on 8/30/2017.
 */
public class MidElementFinding {
    static void getBasicCollectionsMidElement(Collection<Integer> myCollection) {
        Object tempArray[] = myCollection.toArray();
        if ((myCollection.size()) % 2 == 0) {
            Object midCollectionElement1 = tempArray[(tempArray.length) / 2];
            Object midCollectionElement2 = tempArray[(tempArray.length) / 2 - 1];
            long startTime = System.nanoTime();
            Boolean elementCheck1 = myCollection.contains(midCollectionElement1);
            Boolean elementCheck2 = myCollection.contains(midCollectionElement2);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("\nCollection mid elements are: " + midCollectionElement1 + ", " +
                    midCollectionElement2);
            System.out.println("Collection operation time = " + duration);
        } else {
            Object midCollectionElement = tempArray[(tempArray.length) / 2 - 1];
            long startTime = System.nanoTime();
            Boolean elementCheck1 = myCollection.contains(midCollectionElement);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Collection mid element is: %d\n" + midCollectionElement);
            System.out.println("Collection operation time = " + duration);
        }
    }

    static void getHashMapMidElement(HashMap<Integer, Integer> myHashMap) {
        if ((myHashMap.size()) % 2 == 0) {
            long startTime = System.nanoTime();
            int hashMapMidElement1 = myHashMap.get(myHashMap.size() / 2);
            int hashMapMidElement2 = myHashMap.get((myHashMap.size() / 2) - 1);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.format("\nHashMap mid elements are: %d, %d\n", hashMapMidElement1,
                    hashMapMidElement2);
            System.out.println("HashMap operation time = " + duration);
        } else {
            long startTime = System.nanoTime();
            int hashMapMidElement = myHashMap.get((myHashMap.size() / 2) - 1);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.format("HashMap mid element is: %d\n", hashMapMidElement);
            System.out.println("HashMap operation time = " + duration);
        }
    }

    static void getLinkedListMidElement(LinkedList<Integer> myLinkedList) {
        if ((myLinkedList.size()) % 2 == 0) {
            long startTime = System.nanoTime();
            int linkedListMidElement1 = myLinkedList.get(myLinkedList.size() / 2);
            int linkedListMidElement2 = myLinkedList.get((myLinkedList.size() / 2) - 1);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.format("\nLinkedList mid elements are: %d, %d\n", linkedListMidElement1,
                    linkedListMidElement2);
            System.out.println("LinkedList operation time = " + duration);
        } else {
            long startTime = System.nanoTime();
            int linkedListMidElement = myLinkedList.get((myLinkedList.size() / 2) - 1);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.format("LinkedList mid element is: %d\n", linkedListMidElement);
            System.out.println("LinkedList operation time = " + duration);
        }
    }

    static void getArrayListMidElement(ArrayList<Integer> myArrayList) {
        if ((myArrayList.size()) % 2 == 0) {
            long startTime = System.nanoTime();
            int arrayListMidElement1 = myArrayList.get(myArrayList.size() / 2);
            int arrayListMidElement2 = myArrayList.get((myArrayList.size() / 2) - 1);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.format("\nArrayList mid elements are:%d, %d\n", arrayListMidElement1,
                    arrayListMidElement2);
            System.out.println("ArrayList operation time = " + duration);
        } else {
            long startTime = System.nanoTime();
            int arrayListMidElement = myArrayList.get((myArrayList.size() / 2) - 1);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.format("ArrayList mid element is:%d\n", arrayListMidElement);
            System.out.println("ArrayList operation time = " + duration);
        }
    }
}