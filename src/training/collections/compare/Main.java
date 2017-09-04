package training.collections.compare;

import java.util.Scanner;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter the number of elements to add into collection:");
        Scanner elementsQuantityScanner = new Scanner(System.in);
        int elementsQuantity = elementsQuantityScanner.nextInt();
        int elementsArray[] = new int[elementsQuantity];
        for (int i = 0; i < elementsArray.length; i++) {
            elementsArray[i] = (int) Math.round((Math.random() * 100));
        }
        System.out.println("Map structure:\n" + HashMapFill.doHashMapFill(elementsArray));
        System.out.println("Collection structure:\n" + CollectionFill.doBasicCollectionCreation(elementsArray));
        System.out.println();

        long collectionsMidElementTime = CollectionFill.getMidElement(CollectionFill.doBasicCollectionCreation(elementsArray));
        long linkedListMidElementTime = LinkedListFill.getMidElement(LinkedListFill.doLinkedListFill(elementsArray));
        long arrayListMidElementTime = ArrayListFill.getMidElement(ArrayListFill.doArrayListFill(elementsArray));
        long listMidElementTime = ListFill.getMidElement(ListFill.doListFill(elementsArray));
        long hashMapMidElementTime = HashMapFill.getMidElement(HashMapFill.doHashMapFill(elementsArray));
        long hashTableMidElementTime = HashTableFill.getHashTableMidElement(HashTableFill.doHashTableFill(elementsArray));
        long setMidElementTime = SetFill.getSetMidElement(SetFill.doSetFill(elementsArray));
        System.out.println();

        long arrayListAddMultipleElementsTime = ArrayListFill.addMultipleElements(elementsArray);
        long collectionAddMultipleElementsTime = CollectionFill.addMultipleElements(elementsArray);
        long linkedLisAddMultipleElementsTime = LinkedListFill.addMultipleElements(elementsArray);
        long listAddMultipleElementsTime = ListFill.addMultipleElements(elementsArray);
        long setAddMultipleElementsTime = SetFill.addMultipleElements(elementsArray);
        System.out.println();

        long arrayListAddSingleElementToPositionTime = ArrayListFill.addSingleElementToPosition(elementsArray);
        long collectionAddSingleElementToPositionTime = CollectionFill.addSingleElement(elementsArray);
        long linkedListAddSingleElementToPositionTime = LinkedListFill.addSingleElementToPosition(elementsArray);
        long setAddSingleElementToPositionTime = SetFill.addSingleElement(elementsArray);
        System.out.println();

        long arrayListContainsCheckTime = ArrayListFill.containsCheck(elementsArray);
        long collectionContainsCheckTime = CollectionFill.containsCheck(elementsArray);
        long hashMapContainsCheckTime = HashMapFill.containsCheck(HashMapFill.doHashMapFill(elementsArray));
        long hashTableContainsCheckTime = HashTableFill.containsCheck(HashTableFill.doHashTableFill(elementsArray));
        long linkedListContainsCheckTime = LinkedListFill.containsCheck(elementsArray);
        long listContainsCheckTime = ListFill.containsCheck(elementsArray);
        long SetContainsCheckTime = SetFill.containsCheck(elementsArray);
        System.out.println();

        long arrayListClearTime = ArrayListFill.clear(elementsArray);
        long collectionClearTime = CollectionFill.clear(elementsArray);
        long hashMapClearTime = HashMapFill.clear(HashMapFill.doHashMapFill(elementsArray));
        long hashTableClearTime = HashTableFill.clear(HashTableFill.doHashTableFill(elementsArray));
        long linkedListClearTime = LinkedListFill.clear(elementsArray);
        long listClearTime = ListFill.clear(elementsArray);
        long setClearTime = SetFill.clear(elementsArray);
        System.out.println();

        long arrayListCloneTime = ArrayListFill.clone(elementsArray);
        long hashMapCloneTime = HashMapFill.clone(HashMapFill.doHashMapFill(elementsArray));
        long hashTableCloneTime = HashTableFill.clone(HashTableFill.doHashTableFill(elementsArray));
        long linkedListCloneTime = LinkedListFill.clone(elementsArray);
        System.out.println();

        long arrayListIndexOfCheckTime = ArrayListFill.indexOfCheck(elementsArray);
        long linkedListIndexOfCheckTime = LinkedListFill.indexOfCheck(elementsArray);
        long listIndexOfCheckTime = ListFill.indexOfCheck(elementsArray);
        System.out.println();

        long arrayListLastIndexOfCheckTime = ArrayListFill.lastIndexOfCheck(elementsArray);
        long linkedListLastIndexOfCheckTime = LinkedListFill.lastIndexOfCheck(elementsArray);
        long listLastIndexOfCheckTime = ListFill.lastIndexOfCheck(elementsArray);
        System.out.println();

        long arrayListRemoveSingleElementTime = ArrayListFill.removeSingleElement(elementsArray);
        long collectionRemoveSingleElementTime = CollectionFill.removeSingleElement(elementsArray);
        long linkedListRemoveSingleElementTime = LinkedListFill.removeSingleElement(elementsArray);
        long setRemoveSingleElementTime = SetFill.removeSingleElement(elementsArray);
        System.out.println();

        long arrayListRemoveSpecificElementTime = ArrayListFill.removeSpecificElement(elementsArray);
        long collectionRemoveSpecificElementTime = CollectionFill.removeSpecificElement(elementsArray);
        long linkedListRemoveSpecificElementTime = LinkedListFill.removeSpecificElement(elementsArray);
        long listRemoveSpecificElementTime = ListFill.removeSpecificElement(elementsArray);
        long setRemoveSpecificElementTime = SetFill.removeSpecificElement(elementsArray);
        System.out.println();

        long arrayListReplaceElementTime = ArrayListFill.replaceElement(elementsArray);
        long linkedListReplaceElementTime = LinkedListFill.replaceElement(elementsArray);
        long listReplaceElementTime = ListFill.replaceElement(elementsArray);
        System.out.println();

        long arrayListSizeOfTime = ArrayListFill.sizeOf(elementsArray);
        long collectionSizeOfTime = CollectionFill.sizeOf(elementsArray);
        long linkedListSizeOfTime = LinkedListFill.sizeOf(elementsArray);
        long hashMapSizeOfTime = HashMapFill.sizeOf(HashMapFill.doHashMapFill(elementsArray));
        long hashTableSizeOfTime = HashTableFill.sizeOf(HashTableFill.doHashTableFill(elementsArray));
        long listSizeOfTime = ListFill.sizeOf(elementsArray);
        long setSizeOfTime = SetFill.sizeOf(elementsArray);
        System.out.println();

        long arrayListToArrayTime = ArrayListFill.toArray(elementsArray);
        long collectionToArrayTime = CollectionFill.toArray(elementsArray);
        long linkedListToArrayTime = LinkedListFill.toArray(elementsArray);
        long listToArrayTime = ListFill.toArray(elementsArray);
        long setToArrayTime = SetFill.toArray(elementsArray);
        System.out.println();

        long arrayListReturnIteratorTime = ArrayListFill.returnIterator(elementsArray);
        long collectionReturnIteratorTime = CollectionFill.returnIterator(elementsArray);
        long linkedListReturnIteratorTime = LinkedListFill.returnIterator(elementsArray);
        long listReturnIteratorTime = ListFill.returnIterator(elementsArray);
        long setReturnIteratorTime = SetFill.returnIterator(elementsArray);
        System.out.println();

        long arrayListHashCodeTime = ArrayListFill.hashCode(elementsArray);
        long collectionHashCodeTime = CollectionFill.hashCode(elementsArray);
        long hashTableHashCodeTime = HashTableFill.hashCode(HashTableFill.doHashTableFill(elementsArray));
        long linkedListHashCodeTime = LinkedListFill.hashCode(elementsArray);
        long listHashCodeTime = ListFill.hashCode(elementsArray);
        long setHashCodeTime = SetFill.hashCode(elementsArray);
    }
}