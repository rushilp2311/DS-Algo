public class kadaneAlgorithm {
    public static int kadaneAlgorithm(int[] array){
    int maxEndingHere = array[0];
    int maxSoFar = array[0];
    for(int i = 1; i< array.length;i++){
        int num = array[i];
        maxEndingHere = Math.max(num,maxEndingHere + num);
        maxSoFar = Math.max(maxSoFar, maxEndingHere);
    }
    return maxSoFar;
    }

    public static void main(String[] args) {
        int[] array = {1,2,-5,3,-2,8};
        System.out.println(kadaneAlgorithm(array));
    }


}
