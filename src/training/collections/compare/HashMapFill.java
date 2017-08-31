package training.collections.compare;

import java.util.HashMap;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
class HashMapFill {
    static HashMap<Integer, Integer> doHashMapFill(int elementsArray[]) {
        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        for (int j = 0; j < elementsArray.length; j++) {
            myHashMap.put(j, elementsArray[j]);
        }
        return myHashMap;
    }
}