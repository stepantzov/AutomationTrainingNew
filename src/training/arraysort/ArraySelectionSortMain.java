package training.arraysort;

/**
 * Created by Ivan_Stepantsov on 7/21/2017.
 */
public class ArraySelectionSortMain {
    static void doSort(int[] array) {
        int[] sortedArray = ArraySelectionSort.doArraySelectionSort(array);
        for (int i : sortedArray) {
            System.out.format("%d  ", i);
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4, 5, 3, 6, 7, 4, 3, 2, 6, 7, 6, 3, -3, -4, -6, 3};
        ArraySelectionSortMain.doSort(myArray);
        System.out.println("\nMin element = " + ArraySelectionSort.returnMinElement(myArray));
        System.out.println("Max element = " + ArraySelectionSort.returnMaxElement(myArray));
    }
}