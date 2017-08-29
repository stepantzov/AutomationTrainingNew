package training.collections.compare;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
public class HashMapFill extends BasicMapFill {
    static HashMap doHashMapFill(int elementsArray[]) {
        int elementsSequence[] = elementsArray;
        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        for (int j = 0; j < elementsSequence.length; j++) {
            myHashMap.put(j, elementsSequence[j]);
        }
        return myHashMap;
    }

    static void getMidElement(HashMap myHashMap) {
        long startTime = System.nanoTime();
        if ((myHashMap.size()) % 2 == 0) {
            System.out.format("\nHashMap mid elements are: %d, %d\n", myHashMap.get(myHashMap.size() / 2),
                    myHashMap.get((myHashMap.size() / 2) - 1));
        } else {
            System.out.format("HashMap mid element is: %d\n",myHashMap.get((myHashMap.size() / 2) - 1));
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashMap operation time = " + duration);
    }
}


