public class InsertionSort {
    public  int[] insertionSort(int[] array){
        for(int i =0;i<array.length;i++){
            int j = i;
            while(j > 0 && array[j] < array[j-1]){
                swap(j,j-1,array);
                j -= 1;
            }
        }
        return array;
    }
    public  void swap(int i,int j,int[]array){
        int temp = 0;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
