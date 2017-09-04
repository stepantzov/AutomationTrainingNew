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

        CollectionFill.getMidElement(CollectionFill.doBasicCollectionCreation(elementsArray));
        LinkedListFill.getMidElement(LinkedListFill.doLinkedListFill(elementsArray));
        ArrayListFill.getMidElement(ArrayListFill.doArrayListFill(elementsArray));
        ListFill.getMidElement(ListFill.doListFill(elementsArray));
        HashMapFill.getMidElement(HashMapFill.doHashMapFill(elementsArray));
        HashTableFill.getHashTableMidElement(HashTableFill.doHashTableFill(elementsArray));
        SetFill.getSetMidElement(SetFill.doSetFill(elementsArray));
        System.out.println();

        ArrayListFill.addMultipleElements(elementsArray);
        CollectionFill.addMultipleElements(elementsArray);
        LinkedListFill.addMultipleElements(elementsArray);
        ListFill.addMultipleElements(elementsArray);
        SetFill.addMultipleElements(elementsArray);
        System.out.println();

        ArrayListFill.addSingleElementToPosition(elementsArray);
        CollectionFill.addSingleElement(elementsArray);
        LinkedListFill.addSingleElementToPosition(elementsArray);
        SetFill.addSingleElement(elementsArray);
        System.out.println();

        ArrayListFill.containsCheck(elementsArray);
        CollectionFill.containsCheck(elementsArray);
        HashMapFill.containsCheck(HashMapFill.doHashMapFill(elementsArray));
        HashTableFill.containsCheck(HashTableFill.doHashTableFill(elementsArray));
        LinkedListFill.containsCheck(elementsArray);
        ListFill.containsCheck(elementsArray);
        SetFill.containsCheck(elementsArray);
        System.out.println();

        ArrayListFill.clear(elementsArray);
        CollectionFill.clear(elementsArray);
        HashMapFill.clear(HashMapFill.doHashMapFill(elementsArray));
        HashTableFill.clear(HashTableFill.doHashTableFill(elementsArray));
        LinkedListFill.clear(elementsArray);
        ListFill.clear(elementsArray);
        SetFill.clear(elementsArray);
        System.out.println();

        ArrayListFill.clone(elementsArray);
        HashMapFill.clone(HashMapFill.doHashMapFill(elementsArray));
        HashTableFill.clone(HashTableFill.doHashTableFill(elementsArray));
        LinkedListFill.clone(elementsArray);
        System.out.println();

        ArrayListFill.indexOfCheck(elementsArray);
        LinkedListFill.indexOfCheck(elementsArray);
        ListFill.indexOfCheck(elementsArray);
        System.out.println();

        ArrayListFill.lastIndexOfCheck(elementsArray);
        LinkedListFill.lastIndexOfCheck(elementsArray);
        ListFill.lastIndexOfCheck(elementsArray);
        System.out.println();

        ArrayListFill.removeSingleElement(elementsArray);
        CollectionFill.removeSingleElement(elementsArray);
        LinkedListFill.removeSingleElement(elementsArray);
        SetFill.removeSingleElement(elementsArray);
        System.out.println();

        ArrayListFill.removeSpecificElement(elementsArray);
        CollectionFill.removeSpecificElement(elementsArray);
        LinkedListFill.removeSpecificElement(elementsArray);
        ListFill.removeSpecificElement(elementsArray);
        SetFill.removeSpecificElement(elementsArray);
        System.out.println();

        ArrayListFill.replaceElement(elementsArray);
        LinkedListFill.replaceElement(elementsArray);
        ListFill.replaceElement(elementsArray);
        System.out.println();

        ArrayListFill.sizeOf(elementsArray);
        CollectionFill.sizeOf(elementsArray);
        LinkedListFill.sizeOf(elementsArray);
        HashMapFill.sizeOf(HashMapFill.doHashMapFill(elementsArray));
        HashTableFill.sizeOf(HashTableFill.doHashTableFill(elementsArray));
        ListFill.sizeOf(elementsArray);
        SetFill.sizeOf(elementsArray);
        System.out.println();

        ArrayListFill.toArray(elementsArray);
        CollectionFill.toArray(elementsArray);
        LinkedListFill.toArray(elementsArray);
        ListFill.toArray(elementsArray);
        SetFill.toArray(elementsArray);
        System.out.println();

        ArrayListFill.returnIterator(elementsArray);
        CollectionFill.returnIterator(elementsArray);
        LinkedListFill.returnIterator(elementsArray);
        ListFill.returnIterator(elementsArray);
        SetFill.returnIterator(elementsArray);
        System.out.println();

        ArrayListFill.hashCode(elementsArray);
        CollectionFill.hashCode(elementsArray);
        HashTableFill.hashCode(HashTableFill.doHashTableFill(elementsArray));
        LinkedListFill.hashCode(elementsArray);
        ListFill.hashCode(elementsArray);
        SetFill.hashCode(elementsArray);
    }
}