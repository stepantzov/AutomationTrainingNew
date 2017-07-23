package training.array_selection_sort;

/**
 * Created by Ivan_Stepantsov on 7/20/2017.
 */
class ArraySelectionSort {
    static int[] doArraySelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;

            int smallNumber = array[index];
            array[index] = array[i];
            array[i] = smallNumber;
        }
        return array;
    }

    static int returnMinElement(int[] array) {
        return array[0];
    }

    static int returnMaxElement(int[] array) {
        return array[array.length - 1];
    }
}