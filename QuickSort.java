public class QuickSort {
    public static int[] quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
        return array;
    }

    public static void quickSortHelper(int[] array, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return;
        }
        int pivotIndex = startIndex;
        int leftIndex = startIndex + 1;
        int rightIndex = endIndex;
        while (rightIndex >= leftIndex) {
            if (array[leftIndex] > array[pivotIndex] && array[rightIndex] < array[pivotIndex]) {
                swap(leftIndex, rightIndex, array);
            }
            if (array[leftIndex] <= array[pivotIndex]) {
                leftIndex++;
            }
            if (array[rightIndex] >= array[pivotIndex]) {
                rightIndex--;
            }
        }
        swap(pivotIndex, rightIndex, array);
        boolean isleftSubarrayIsSmaller = rightIndex - 1 - startIndex < endIndex - (rightIndex + 1);

        if (isleftSubarrayIsSmaller) {
            quickSortHelper(array, startIndex, rightIndex - 1);
            quickSortHelper(array, rightIndex + 1, endIndex);
        }
        else{
            quickSortHelper(array, rightIndex + 1, endIndex);
            quickSortHelper(array, startIndex, rightIndex - 1);
        }
    }

    public static void swap(int i, int j, int[] array) {
        int temp = 0;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
