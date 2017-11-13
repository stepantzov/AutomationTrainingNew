package training.collections.compare;

import java.util.LinkedList;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
class LinkedListFill {
    static LinkedList<Integer> doLinkedListFill(int elementsArray[]) {
        LinkedList newLinkedList = new LinkedList(CollectionFill.doBasicCollectionCreation(elementsArray));

        return newLinkedList;
    }

    static long addMultipleElements(int elementsArray[]) {
        LinkedList<Integer> myLinkedList = LinkedListFill.doLinkedListFill(elementsArray);
        long startTime = System.nanoTime();

        myLinkedList.addAll(myLinkedList);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList AddMultipleElements operation time = " + duration);

        return duration;
    }

    static long getMidElement(LinkedList<Integer> myLinkedList) {
        if ((myLinkedList.size()) % 2 == 0) {
            long startTime = System.nanoTime();

            int linkedListMidElement1 = myLinkedList.get(myLinkedList.size() / 2);
            int linkedListMidElement2 = myLinkedList.get((myLinkedList.size() / 2) - 1);

            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("LinkedList GetMidElement operation time = " + duration);

            return duration;

        } else {
            long startTime = System.nanoTime();
            int linkedListMidElement = myLinkedList.get((myLinkedList.size() / 2) - 1);

            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("LinkedList GetMidElement operation time = " + duration);

            return duration;
        }
    }

    static long addSingleElementToPosition(int elementsArray[]) {
        int insertPosition = elementsArray.length / 2;
        LinkedList<Integer> myLinkedList = LinkedListFill.doLinkedListFill(elementsArray);
        long startTime = System.nanoTime();

        myLinkedList.add(insertPosition, 1);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList AddSingleElementToPosition operation time = " + duration);

        return duration;
    }

    static long containsCheck(int elementsArray[]) {
        LinkedList<Integer> myLinkedList = LinkedListFill.doLinkedListFill(elementsArray);
        long startTime = System.nanoTime();

        myLinkedList.contains(1);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList ContainsCheck operation time = " + duration);

        return duration;
    }

    static long clear(int elementsArray[]) {
        LinkedList<Integer> myLinkedList = LinkedListFill.doLinkedListFill(elementsArray);
        long startTime = System.nanoTime();

        myLinkedList.clear();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList Clear operation time = " + duration);

        return duration;
    }

    static long clone(int elementsArray[]) {
        LinkedList<Integer> myLinkedList = LinkedListFill.doLinkedListFill(elementsArray);
        long startTime = System.nanoTime();

        myLinkedList.clone();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList Clone operation time = " + duration);

        return duration;
    }

    static long indexOfCheck(int elementsArray[]) {
        LinkedList<Integer> myLinkedList = LinkedListFill.doLinkedListFill(elementsArray);
        long startTime = System.nanoTime();

        myLinkedList.indexOf(1);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList IndexOfCheck operation time = " + duration);

        return duration;
    }

    static long lastIndexOfCheck(int elementsArray[]) {
        LinkedList<Integer> myLinkedList = LinkedListFill.doLinkedListFill(elementsArray);
        long startTime = System.nanoTime();

        myLinkedList.lastIndexOf(1);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList LastIndexOfCheck operation time = " + duration);

        return duration;
    }

    static long removeSingleElement(int elementsArray[]) {
        int insertPosition = elementsArray.length / 2;
        LinkedList<Integer> myLinkedList = LinkedListFill.doLinkedListFill(elementsArray);
        long startTime = System.nanoTime();

        myLinkedList.remove(insertPosition);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList RemoveSingleElement operation time = " + duration);

        return duration;
    }

    static long removeSpecificElement(int elementsArray[]) {
        LinkedList<Integer> myLinkedList = LinkedListFill.doLinkedListFill(elementsArray);
        long startTime = System.nanoTime();

        myLinkedList.remove(1);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList RemoveSpecificElement operation time = " + duration);

        return duration;
    }

    static long replaceElement(int elementsArray[]) {
        int insertPosition = elementsArray.length / 2;
        LinkedList<Integer> myLinkedList = LinkedListFill.doLinkedListFill(elementsArray);
        long startTime = System.nanoTime();

        myLinkedList.set(insertPosition, 1);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList ReplaceElement operation time = " + duration);

        return duration;
    }

    static long sizeOf(int elementsArray[]) {
        LinkedList<Integer> myLinkedList = LinkedListFill.doLinkedListFill(elementsArray);
        long startTime = System.nanoTime();

        myLinkedList.size();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList SizeOf operation time = " + duration);

        return duration;
    }

    static long toArray(int elementsArray[]) {
        LinkedList<Integer> myLinkedList = LinkedListFill.doLinkedListFill(elementsArray);
        long startTime = System.nanoTime();

        myLinkedList.toArray();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList ToArray operation time = " + duration);

        return duration;
    }

    static long returnIterator(int elementsArray[]) {
        LinkedList<Integer> myLinkedList = LinkedListFill.doLinkedListFill(elementsArray);
        long startTime = System.nanoTime();

        myLinkedList.iterator();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList ReturnIterator operation time = " + duration);

        return duration;
    }

    static long hashCode(int elementsArray[]) {
        LinkedList<Integer> myLinkedList = LinkedListFill.doLinkedListFill(elementsArray);
        long startTime = System.nanoTime();

        myLinkedList.hashCode();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList HashCode operation time = " + duration);

        return duration;
    }

    static long getFirst(int elementsArray[]) {
        LinkedList<Integer> myLinkedList = LinkedListFill.doLinkedListFill(elementsArray);
        long startTime = System.nanoTime();

        myLinkedList.getFirst();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList GetFirst operation time = " + duration);

        return duration;
    }

    static long getLast(int elementsArray[]) {
        LinkedList<Integer> myLinkedList = LinkedListFill.doLinkedListFill(elementsArray);
        long startTime = System.nanoTime();

        myLinkedList.getLast();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("LinkedList GetLast operation time = " + duration);

        return duration;
    }
}