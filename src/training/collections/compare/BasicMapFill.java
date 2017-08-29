package training.collections.compare;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
public class BasicMapFill {
    static Map myMapCreation(int elementsArray []) {
        int elementsSequence[] = elementsArray;
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int j = 0; j < elementsSequence.length; j++) {
            myMap.put(j, elementsSequence[j]);
        }
        return myMap;
    }
}
