package training.array_selection_sort;

/**
 * Created by Ivan_Stepantsov on 7/20/2017.
 */
class ArraySelectionSort {
    public static int [] doArraySelectionSort(int[] array) {


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

    public static void main(String[] args) {
        int [] myArray = {4, 5, 3, 6, 7, 4, 3, 2, 6, 7, 6, 3, -3, -4, -6, 3};
        int [] sortedArray = doArraySelectionSort(myArray);

        for (int i: sortedArray){
            System.out.format("%d, ",i);
        }
    }
}
