package training.collections.compare;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
class BasicMapFill {
    static Map myMapCreation(int elementsArray[]) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int j = 0; j < elementsArray.length; j++) {
            myMap.put(j, elementsArray[j]);
        }
        return myMap;
    }
}