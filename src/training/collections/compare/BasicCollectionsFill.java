package training.collections.compare;

import java.util.*;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
abstract class BasicCollectionsFill {
    static Collection doBasicCollectionCreation(int elementsArray[]) {
        Collection myCollection = new ArrayList();
        for (int i : elementsArray) myCollection.add(i);
        return myCollection;
    }

    static void getMidElement(Collection myCollection) {
        Object tempArray[] = myCollection.toArray();
        if ((tempArray.length) % 2 == 0) {
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
}