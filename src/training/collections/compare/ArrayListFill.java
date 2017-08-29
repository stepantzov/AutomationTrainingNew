package training.collections.compare;

import java.util.ArrayList;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
public class ArrayListFill extends BasicCollectionsFill {
    static ArrayList doArrayListFill(int elementsArray[]) {
        int elementsSequence[] = elementsArray;
        ArrayList myArrayList = new ArrayList();
        for (Integer i : elementsSequence)
            myArrayList.add(i);
        return myArrayList;
    }

    static void getMidElement(ArrayList myArrayList) {
        long startTime = System.nanoTime();
        if ((myArrayList.size()) % 2 == 0) {
            System.out.format("\nArrayList mid elements are:%d, %d\n", myArrayList.get(myArrayList.size() / 2),
                    myArrayList.get((myArrayList.size() / 2) - 1));
        } else {
            System.out.format("ArrayList mid element is:%d\n", myArrayList.get((myArrayList.size() / 2) - 1));
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList operation time = " + duration);
    }
}
