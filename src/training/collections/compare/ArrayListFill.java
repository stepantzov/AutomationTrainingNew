package training.collections.compare;

import java.util.ArrayList;

/**
 * Created by Ivan_Stepantsov on 8/31/2017.
 */
class ArrayListFill {
    static ArrayList<Integer> doArrayListFill(int elementsArray[]) {
        ArrayList<Integer> newArrayList = new ArrayList(CollectionFill.doBasicCollectionCreation(elementsArray));
        return newArrayList;
    }

    static long addMultipleElements(int elementsArray[]) {
        ArrayList<Integer> myArrayList = ArrayListFill.doArrayListFill(elementsArray);
        long startTime = System.nanoTime();
        myArrayList.addAll(myArrayList);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList AddMultipleElements operation time = " + duration);
        return duration;
    }

    static long getMidElement(ArrayList<Integer> myArrayList) {
        if ((myArrayList.size()) % 2 == 0) {
            long startTime = System.nanoTime();
            int arrayListMidElement1 = myArrayList.get(myArrayList.size() / 2);
            int arrayListMidElement2 = myArrayList.get((myArrayList.size() / 2) - 1);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("ArrayList GetMidElement operation time = " + duration);
            return duration;
        } else {
            long startTime = System.nanoTime();
            int arrayListMidElement = myArrayList.get((myArrayList.size() / 2) - 1);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("ArrayList GetMidElement operation time = " + duration);
            return duration;
        }
    }

    static long addSingleElementToPosition(int elementsArray[]) {
        int insertPosition = elementsArray.length / 2;
        ArrayList<Integer> myArrayList = ArrayListFill.doArrayListFill(elementsArray);
        long startTime = System.nanoTime();
        myArrayList.add(insertPosition, 1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList AddSingleElementToPosition operation time = " + duration);
        return duration;
    }

    static long containsCheck(int elementsArray[]) {
        ArrayList<Integer> myArrayList = ArrayListFill.doArrayListFill(elementsArray);
        long startTime = System.nanoTime();
        myArrayList.contains(1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList ContainsCheck operation time = " + duration);
        return duration;
    }

    static long clear(int elementsArray[]) {
        ArrayList<Integer> myArrayList = ArrayListFill.doArrayListFill(elementsArray);
        long startTime = System.nanoTime();
        myArrayList.clear();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList Clear operation time = " + duration);
        return duration;
    }

    static long clone(int elementsArray[]) {
        ArrayList<Integer> myArrayList = ArrayListFill.doArrayListFill(elementsArray);
        long startTime = System.nanoTime();
        myArrayList.clone();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(myArrayList);
        System.out.println("ArrayList Clone operation time = " + duration);
        return duration;
    }

    static long indexOfCheck(int elementsArray[]) {
        ArrayList<Integer> myArrayList = ArrayListFill.doArrayListFill(elementsArray);
        long startTime = System.nanoTime();
        myArrayList.indexOf(1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList IndexOf operation time = " + duration);
        return duration;
    }

    static long lastIndexOfCheck(int elementsArray[]) {
        ArrayList<Integer> myArrayList = ArrayListFill.doArrayListFill(elementsArray);
        long startTime = System.nanoTime();
        myArrayList.lastIndexOf(1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList LastIndexOf operation time = " + duration);
        return duration;
    }

    static long removeSingleElement(int elementsArray[]) {
        int insertPosition = elementsArray.length / 2;
        ArrayList<Integer> myArrayList = ArrayListFill.doArrayListFill(elementsArray);
        long startTime = System.nanoTime();
        myArrayList.remove(insertPosition);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList RemoveSingleElement operation time = " + duration);
        return duration;
    }

    static long removeSpecificElement(int elementsArray[]) {
        ArrayList<Integer> myArrayList = ArrayListFill.doArrayListFill(elementsArray);
        long startTime = System.nanoTime();
        myArrayList.remove(1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList RemoveSingleElement operation time = " + duration);
        return duration;
    }

    static long replaceElement(int elementsArray[]) {
        int insertPosition = elementsArray.length / 2;
        ArrayList<Integer> myArrayList = ArrayListFill.doArrayListFill(elementsArray);
        long startTime = System.nanoTime();
        myArrayList.set(insertPosition, 1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList ReplaceElement operation time = " + duration);
        return duration;
    }

    static long sizeOf(int elementsArray[]) {
        ArrayList<Integer> myArrayList = ArrayListFill.doArrayListFill(elementsArray);
        long startTime = System.nanoTime();
        myArrayList.size();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList SizeOf operation time = " + duration);
        return duration;
    }

    static long toArray(int elementsArray[]) {
        ArrayList<Integer> myArrayList = ArrayListFill.doArrayListFill(elementsArray);
        long startTime = System.nanoTime();
        myArrayList.toArray();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList ToArray operation time = " + duration);
        return duration;
    }

    static long returnIterator(int elementsArray[]) {
        ArrayList<Integer> myArrayList = ArrayListFill.doArrayListFill(elementsArray);
        long startTime = System.nanoTime();
        myArrayList.iterator();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList ReturnIterator operation time = " + duration);
        return duration;
    }

    static long hashCode(int elementsArray[]) {
        ArrayList<Integer> myArrayList = ArrayListFill.doArrayListFill(elementsArray);
        long startTime = System.nanoTime();
        myArrayList.hashCode();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList HashCode operation time = " + duration);
        return duration;
    }
}