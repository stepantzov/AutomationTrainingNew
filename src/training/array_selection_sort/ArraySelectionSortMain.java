package training.array_selection_sort;

/**
 * Created by Ivan_Stepantsov on 7/21/2017.
 */
public class ArraySelectionSortMain {
    public static void main(String[] args) {
        int[] myArray = {4, 5, 3, 6, 7, 4, 3, 2, 6, 7, 6, 3, -3, -4, -6, 3};
        int[] sortedArray = ArraySelectionSort.doArraySelectionSort(myArray);

        for (int i : sortedArray) {
            System.out.format("%d  ", i);
        }
        System.out.println("\nMin element = " + ArraySelectionSort.returnMinElement(myArray));
        System.out.println("Max element = " + ArraySelectionSort.returnMaxElement(myArray));
    }
}

