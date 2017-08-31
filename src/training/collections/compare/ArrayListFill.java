package training.collections.compare;

import java.util.ArrayList;

/**
 * Created by Ivan_Stepantsov on 8/31/2017.
 */
public class ArrayListFill {
    static ArrayList<Integer> doArrayListFill(int elementsArray[]) {
        ArrayList<Integer> newArrayList = new ArrayList(CollectionFill.doBasicCollectionCreation(elementsArray));
        return newArrayList;
    }
}