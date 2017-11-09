package training.collections.compare;

import java.util.*;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
class CollectionFill {
    static Collection<Integer> doBasicCollectionCreation(int elementsArray[]) {
        Collection<Integer> myCollection = new ArrayList<>();
        for (int i : elementsArray) myCollection.add(i);

        return myCollection;
    }

    static long addMultipleElements(int elementsArray[]) {
        Collection<Integer> myCollection = CollectionFill.doBasicCollectionCreation(elementsArray);
        long startTime = System.nanoTime();

        myCollection.addAll(myCollection);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Collection AddMultipleElements operation time = " + duration);

        return duration;
    }

    static long getMidElement(Collection<Integer> myCollection) {
        Object tempArray[] = myCollection.toArray();

        if ((myCollection.size()) % 2 == 0) {
            Object midCollectionElement1 = tempArray[(tempArray.length) / 2];
            Object midCollectionElement2 = tempArray[(tempArray.length) / 2 - 1];
            long startTime = System.nanoTime();

            Boolean elementCheck1 = myCollection.contains(midCollectionElement1);
            Boolean elementCheck2 = myCollection.contains(midCollectionElement2);

            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Collection GetMidElement operation time = " + duration);

            return duration;

        } else {
            Object midCollectionElement = tempArray[(tempArray.length) / 2 - 1];
            long startTime = System.nanoTime();

            Boolean elementCheck1 = myCollection.contains(midCollectionElement);

            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Collection GetMidElement operation time = " + duration);

            return duration;
        }
    }

    static long addSingleElement(int elementsArray[]) {
        Collection<Integer> myCollection = CollectionFill.doBasicCollectionCreation(elementsArray);
        long startTime = System.nanoTime();

        myCollection.add(1);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Collection AddSingleElement operation time = " + duration);

        return duration;
    }

    static long clear(int elementsArray[]) {
        Collection<Integer> myCollection = CollectionFill.doBasicCollectionCreation(elementsArray);
        long startTime = System.nanoTime();

        myCollection.clear();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Collection Clear operation time = " + duration);

        return duration;
    }

    static long containsCheck(int elementsArray[]) {
        Collection<Integer> myCollection = CollectionFill.doBasicCollectionCreation(elementsArray);
        long startTime = System.nanoTime();

        myCollection.contains(1);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Collection ContainsCheck operation time = " + duration);

        return duration;
    }

    static long hashCode(int elementsArray[]) {
        Collection<Integer> myCollection = CollectionFill.doBasicCollectionCreation(elementsArray);
        long startTime = System.nanoTime();

        myCollection.hashCode();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Collection HashCode operation time = " + duration);

        return duration;
    }

    static long returnIterator(int elementsArray[]) {
        Collection<Integer> myCollection = CollectionFill.doBasicCollectionCreation(elementsArray);
        long startTime = System.nanoTime();

        myCollection.iterator();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Collection ReturnIterator operation time = " + duration);

        return duration;
    }

    static long removeSingleElement(int elementsArray[]) {
        int insertPosition = elementsArray.length / 2;
        Collection<Integer> myCollection = CollectionFill.doBasicCollectionCreation(elementsArray);
        long startTime = System.nanoTime();

        myCollection.remove(insertPosition);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Collection RemoveSingleElement operation time = " + duration);

        return duration;
    }

    static long sizeOf(int elementsArray[]) {
        Collection<Integer> myCollection = CollectionFill.doBasicCollectionCreation(elementsArray);
        long startTime = System.nanoTime();

        myCollection.size();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Collection SizeOf operation time = " + duration);

        return duration;
    }

    static long toArray(int elementsArray[]) {
        Collection<Integer> myCollection = CollectionFill.doBasicCollectionCreation(elementsArray);
        long startTime = System.nanoTime();

        myCollection.toArray();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Collection ToArray operation time = " + duration);

        return duration;
    }

    static long removeSpecificElement(int elementsArray[]) {
        Collection<Integer> myCollection = CollectionFill.doBasicCollectionCreation(elementsArray);
        long startTime = System.nanoTime();

        myCollection.remove(1);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Collection RemoveSpecificElement operation time = " + duration);

        return duration;
    }
}