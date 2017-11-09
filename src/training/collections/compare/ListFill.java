package training.collections.compare;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan_Stepantsov on 9/1/2017.
 */
public class ListFill {
    static List<Integer> doListFill(int elementsArray[]) {
        List<Integer> newList = new ArrayList(CollectionFill.doBasicCollectionCreation(elementsArray));

        return newList;
    }

    static long addMultipleElements(int elementsArray[]) {
        List<Integer> myList = ListFill.doListFill(elementsArray);
        long startTime = System.nanoTime();

        myList.addAll(myList);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("List AddMultipleElements operation time = " + duration);

        return duration;
    }

    static long getMidElement(List<Integer> myList) {
        if ((myList.size()) % 2 == 0) {
            long startTime = System.nanoTime();

            int arrayListMidElement1 = myList.get(myList.size() / 2);
            int arrayListMidElement2 = myList.get((myList.size() / 2) - 1);

            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("List GetMidElement operation time = " + duration);

            return duration;

        } else {
            long startTime = System.nanoTime();

            int arrayListMidElement = myList.get((myList.size() / 2) - 1);

            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("List GetMidElement operation time = " + duration);

            return duration;
        }
    }

    static long addSingleElementToPosition(int elementsArray[]) {
        int insertPosition = elementsArray.length / 2;
        List<Integer> myList = ListFill.doListFill(elementsArray);
        long startTime = System.nanoTime();

        myList.add(insertPosition, 1);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("List AddSingleElementToPosition operation time = " + duration);

        return duration;
    }

    static long clear(int elementsArray[]) {
        List<Integer> myList = ListFill.doListFill(elementsArray);
        long startTime = System.nanoTime();

        myList.clear();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("List Clear operation time = " + duration);

        return duration;
    }

    static long containsCheck(int elementsArray[]) {
        List<Integer> myList = ListFill.doListFill(elementsArray);
        long startTime = System.nanoTime();

        myList.contains(1);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("List ContainsCheck operation time = " + duration);

        return duration;
    }

    static long hashCode(int elementsArray[]) {
        List<Integer> myList = ListFill.doListFill(elementsArray);
        long startTime = System.nanoTime();

        myList.hashCode();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("List HashCode operation time = " + duration);

        return duration;
    }

    static long returnIterator(int elementsArray[]) {
        List<Integer> myList = ListFill.doListFill(elementsArray);
        long startTime = System.nanoTime();

        myList.iterator();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList ReturnIterator operation time = " + duration);

        return duration;
    }

    static long removeSingleElement(int elementsArray[]) {
        int insertPosition = elementsArray.length / 2;
        List<Integer> myList = ListFill.doListFill(elementsArray);
        long startTime = System.nanoTime();

        myList.remove(insertPosition);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList RemoveSingleElement operation time = " + duration);

        return duration;
    }

    static long removeSpecificElement(int elementsArray[]) {
        List<Integer> myList = ListFill.doListFill(elementsArray);
        long startTime = System.nanoTime();

        myList.remove(1);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList RemoveSpecificElement operation time = " + duration);

        return duration;
    }

    static long replaceElement(int elementsArray[]) {
        int insertPosition = elementsArray.length / 2;
        List<Integer> myList = ListFill.doListFill(elementsArray);
        long startTime = System.nanoTime();

        myList.set(insertPosition, 1);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList ReplaceElement operation time = " + duration);

        return duration;
    }

    static long sizeOf(int elementsArray[]) {
        List<Integer> myList = ListFill.doListFill(elementsArray);
        long startTime = System.nanoTime();

        myList.size();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList SizeOf operation time = " + duration);

        return duration;
    }

    static long indexOfCheck(int elementsArray[]) {
        List<Integer> myList = ListFill.doListFill(elementsArray);
        long startTime = System.nanoTime();

        myList.indexOf(1);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList IndexOfCheck operation time = " + duration);

        return duration;
    }

    static long lastIndexOfCheck(int elementsArray[]) {
        List<Integer> myList = ListFill.doListFill(elementsArray);
        long startTime = System.nanoTime();

        myList.lastIndexOf(1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList LastIndexOfCheck operation time = " + duration);

        return duration;
    }

    static long toArray(int elementsArray[]) {
        List<Integer> myList = ListFill.doListFill(elementsArray);
        long startTime = System.nanoTime();

        myList.toArray();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("List ToArray operation time = " + duration);

        return duration;
    }
}