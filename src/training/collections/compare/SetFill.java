package training.collections.compare;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Ivan_Stepantsov on 9/1/2017.
 */
public class SetFill {
    static Set<Integer> doSetFill(int elementsArray[]) {
        Set<Integer> mySet = new TreeSet<Integer>(CollectionFill.doBasicCollectionCreation(elementsArray));
        return mySet;
    }

    static long getSetMidElement(Set<Integer> mySet) {
        Object tempArray[] = mySet.toArray();
        if ((mySet.size()) % 2 == 0) {
            Object midSetElement1 = tempArray[(tempArray.length) / 2];
            Object midSetElement2 = tempArray[(tempArray.length) / 2 - 1];
            long startTime = System.nanoTime();
            Boolean elementCheck1 = mySet.contains(midSetElement1);
            Boolean elementCheck2 = mySet.contains(midSetElement2);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Set GetSetMidElement operation time = " + duration);
            return duration;
        } else {
            Object midSetElement = tempArray[(tempArray.length) / 2 - 1];
            long startTime = System.nanoTime();
            Boolean elementCheck1 = mySet.contains(midSetElement);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Set Operation time = " + duration);
            return duration;
        }
    }

    static long addMultipleElements(int elementsArray[]) {
        Set<Integer> mySet = SetFill.doSetFill(elementsArray);
        long startTime = System.nanoTime();
        mySet.addAll(mySet);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Set AddMultipleElements operation time = " + duration);
        return duration;
    }

    static long addSingleElement(int elementsArray[]) {
        Set<Integer> mySet = SetFill.doSetFill(elementsArray);
        long startTime = System.nanoTime();
        mySet.add(1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Set AddSingleElement operation time = " + duration);
        return duration;
    }

    static long clear(int elementsArray[]) {
        Set<Integer> mySet = SetFill.doSetFill(elementsArray);
        long startTime = System.nanoTime();
        mySet.clear();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Set Clear operation time = " + duration);
        return duration;
    }

    static long containsCheck(int elementsArray[]) {
        Set<Integer> mySet = SetFill.doSetFill(elementsArray);
        long startTime = System.nanoTime();
        mySet.contains(1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Set ContainsCheck operation time = " + duration);
        return duration;
    }

    static long hashCode(int elementsArray[]) {
        Set<Integer> mySet = SetFill.doSetFill(elementsArray);
        long startTime = System.nanoTime();
        mySet.hashCode();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Set HashCode operation time = " + duration);
        return duration;
    }

    static long returnIterator(int elementsArray[]) {
        Set<Integer> mySet = SetFill.doSetFill(elementsArray);
        long startTime = System.nanoTime();
        mySet.iterator();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Set ReturnIterator operation time = " + duration);
        return duration;
    }

    static long removeSingleElement(int elementsArray[]) {
        int insertPosition = elementsArray.length / 2;
        Set<Integer> mySet = SetFill.doSetFill(elementsArray);
        long startTime = System.nanoTime();
        mySet.remove(insertPosition);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Set RemoveSingleElement operation time = " + duration);
        return duration;
    }

    static long removeSpecificElement(int elementsArray[]) {
        Set<Integer> mySet = SetFill.doSetFill(elementsArray);
        long startTime = System.nanoTime();
        mySet.remove(1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Set RemoveSpecificElement operation time = " + duration);
        return duration;
    }

    static long sizeOf(int elementsArray[]) {
        Set<Integer> mySet = SetFill.doSetFill(elementsArray);
        long startTime = System.nanoTime();
        mySet.size();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Set SizeOf operation time = " + duration);
        return duration;
    }

    static long toArray(int elementsArray[]) {
        Set<Integer> mySet = SetFill.doSetFill(elementsArray);
        long startTime = System.nanoTime();
        mySet.toArray();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Set ToArray operation time = " + duration);
        return duration;
    }
}