package training.collections.compare;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
class BasicCollectionFill {
    static Collection<Integer> doBasicCollectionCreation(int elementsArray[]) {
        Collection <Integer> myCollection = new ArrayList<Integer>();
        for (int i : elementsArray) myCollection.add(i);
        return myCollection;
    }
}