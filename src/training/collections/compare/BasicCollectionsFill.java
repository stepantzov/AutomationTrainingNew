package training.collections.compare;

import java.util.*;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
public abstract class BasicCollectionsFill {
    static Collection doBasicCollectionCreation(int elementsArray []) {
        int elementsSequence [] = elementsArray;
        Collection myCollection = new ArrayList();
        for (Integer i : elementsSequence) myCollection.add(i);
        return myCollection;
    }

    static void getMidElement(Collection myCollection) {
        long startTime = System.nanoTime();
        Object[] tempArray = myCollection.toArray();
        if ((myCollection.size()) % 2 == 0) {
            System.out.format("\nCollection mid elements are: %d, %d\n", tempArray[tempArray.length / 2],
                    tempArray[(tempArray.length / 2) - 1]);
        } else {
            System.out.format("Collection mid element is: %d\n", tempArray[(tempArray.length / 2) - 1]);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Collection operation time = " + duration);
    }
}