public class SelectionSort {
    public static int[] selectSort(int [] array){
        if(array.length == 0){
            return new int[] {};
        }
        int startIndex = 0;
        while(startIndex < array.length - 1){
            int smallestIndex = startIndex;
            for(int i = startIndex + 1; i< array.length;i++){
                if(array[smallestIndex] > array[i]){
                    smallestIndex = i;
                }
            }
            swap(startIndex, smallestIndex, array);
            startIndex ++ ;
        }
        return array;
    }
    public static void swap(int i, int j, int [] array){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
