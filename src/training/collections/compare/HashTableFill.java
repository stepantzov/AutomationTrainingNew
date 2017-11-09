package training.collections.compare;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by Ivan_Stepantsov on 9/1/2017.
 */
public class HashTableFill {
    static Hashtable<Integer, Integer> doHashTableFill(int elementsArray[]) {
        Hashtable<Integer, Integer> myHashTable = new Hashtable<>();
        for (int j = 0; j < elementsArray.length; j++) {
            myHashTable.put(j, elementsArray[j]);
        }
        return myHashTable;
    }

    static long getHashTableMidElement(Hashtable<Integer, Integer> myHashTable) {
        if ((myHashTable.size()) % 2 == 0) {
            long startTime = System.nanoTime();
            int hashTableMidElement1 = myHashTable.get(myHashTable.size() / 2);
            int hashTableMidElement2 = myHashTable.get((myHashTable.size() / 2) - 1);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("HashTable GetHashTableMidElement operation time = " + duration);
            return duration;
        } else {
            long startTime = System.nanoTime();
            int hashTableMidElement = myHashTable.get((myHashTable.size() / 2) - 1);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("HashTable GetHashTableMidElement operation time = " + duration);
            return duration;
        }
    }

    static long clear(Hashtable<Integer, Integer> myHashTable) {
        long startTime = System.nanoTime();
        myHashTable.clear();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashTable Clear operation time = " + duration);
        return duration;
    }

    static long clone(Hashtable<Integer, Integer> myHashTable) {
        long startTime = System.nanoTime();
        myHashTable.clone();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashTable Clone operation time = " + duration);
        return duration;
    }

    static long containsCheck(Hashtable<Integer, Integer> myHashTable) {
        long startTime = System.nanoTime();
        myHashTable.containsValue(1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashTable ContainsCheck operation time = " + duration);
        return duration;
    }

    static long containsKeyCheck(Hashtable<Integer, Integer> myHashTable) {
        long startTime = System.nanoTime();
        myHashTable.containsKey(1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashTable ContainsKeyCheck operation time = " + duration);
        return duration;
    }

    static long putValue(Hashtable<Integer, Integer> myHashTable) {
        long startTime = System.nanoTime();
        myHashTable.put(1, 1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashTable PutValue operation time = " + duration);
        return duration;
    }

    static long entrySetViewReturn(Hashtable<Integer, Integer> myHashTable) {
        long startTime = System.nanoTime();
        myHashTable.entrySet();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashTable EntrySetViewReturn operation time = " + duration);
        return duration;
    }

    static long putAll(Hashtable<Integer, Integer> myHashTable) {
        HashMap myNewHashMap = null;
        long startTime = System.nanoTime();
        myNewHashMap.putAll(myHashTable);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashTable PutAll operation time = " + duration);
        return duration;
    }

    static long removeMapping(Hashtable<Integer, Integer> myHashTable) {
        long startTime = System.nanoTime();
        myHashTable.remove(1, 1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashTable RemoveMapping operation time = " + duration);
        return duration;
    }

    static long sizeOf(Hashtable<Integer, Integer> myHashTable) {
        long startTime = System.nanoTime();
        myHashTable.size();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashTable SizeOf operation time = " + duration);
        return duration;
    }

    static long valuesReturnToCollectionView(Hashtable<Integer, Integer> myHashTable) {
        long startTime = System.nanoTime();
        myHashTable.values();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashTable ValuesReturnToCollectionView operation time = " + duration);
        return duration;
    }

    static long hashCode(Hashtable<Integer, Integer> myHashTable) {
        long startTime = System.nanoTime();
        myHashTable.hashCode();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashTable HashCode operation time = " + duration);
        return duration;
    }
}