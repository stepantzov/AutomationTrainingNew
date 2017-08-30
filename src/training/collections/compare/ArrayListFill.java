package training.collections.compare;

import java.util.ArrayList;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
class ArrayListFill {
    static ArrayList<Integer> doArrayListFill(int elementsArray[]) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        for (int i : elementsArray) myArrayList.add(i);
        return myArrayList;
    }
}