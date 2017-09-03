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

    static long getMidElement(HashMap<Integer, Integer> myHashMap) {
        if ((myHashMap.size()) % 2 == 0) {
            long startTime = System.nanoTime();
            int hashMapMidElement1 = myHashMap.get(myHashMap.size() / 2);
            int hashMapMidElement2 = myHashMap.get((myHashMap.size() / 2) - 1);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("HashMap GetMidElement operation time = " + duration);
            return duration;
        } else {
            long startTime = System.nanoTime();
            int hashMapMidElement = myHashMap.get((myHashMap.size() / 2) - 1);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("HashMap GetMidElement operation time = " + duration);
            return duration;
        }
    }

    static long clear(HashMap<Integer, Integer> myHashMap) {
        long startTime = System.nanoTime();
        myHashMap.clear();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashMap Clear operation time = " + duration);
        return duration;
    }

    static long clone(HashMap<Integer, Integer> myHashMap) {
        long startTime = System.nanoTime();
        myHashMap.clone();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashMap Clone operation time = " + duration);
        return duration;
    }

    static long containsCheck(HashMap<Integer, Integer> myHashMap) {
        long startTime = System.nanoTime();
        myHashMap.containsValue(1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashMap ContainsCheck operation time = " + duration);
        return duration;
    }

    static long containsKeyCheck(HashMap<Integer, Integer> myHashMap) {
        long startTime = System.nanoTime();
        myHashMap.containsKey(1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashMap ContainsKeyCheck operation time = " + duration);
        return duration;
    }

    static long putValue(HashMap<Integer, Integer> myHashMap) {
        long startTime = System.nanoTime();
        myHashMap.put(1, 1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashMap PutValue operation time = " + duration);
        return duration;
    }

    static long entrySetViewReturn(HashMap<Integer, Integer> myHashMap) {
        long startTime = System.nanoTime();
        myHashMap.entrySet();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashMap EntrySetViewReturn operation time = " + duration);
        return duration;
    }

    static long putAll(HashMap<Integer, Integer> myHashMap) {
        HashMap myNewHashMap = null;
        long startTime = System.nanoTime();
        myNewHashMap.putAll(myHashMap);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashMap PutAll operation time = " + duration);
        return duration;
    }

    static long removeMapping(HashMap<Integer, Integer> myHashMap) {
        long startTime = System.nanoTime();
        myHashMap.remove(1, 1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashMap RemoveMapping operation time = " + duration);
        return duration;
    }

    static long sizeOf(HashMap<Integer, Integer> myHashMap) {
        long startTime = System.nanoTime();
        myHashMap.size();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashMap SizeOf operation time = " + duration);
        return duration;
    }

    static long valuesReturnToCollectionView(HashMap<Integer, Integer> myHashMap) {
        long startTime = System.nanoTime();
        myHashMap.values();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashMap ValuesReturnToCollectionView operation time = " + duration);
        return duration;
    }
}