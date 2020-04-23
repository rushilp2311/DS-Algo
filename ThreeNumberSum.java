import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum){
        Arrays.sort(array);
        int currentSum = 0;
        List<Integer[]> al = new ArrayList<>();
        for(int i = 0;i< array.length;i++){
            int left = i+1;
            int right = array.length-1;
            while(left< right){
                currentSum = array[i] + array[left] + array[right];
                if(currentSum == targetSum){
                    Integer[] triplets = {array[i],array[left],array[right]};
                    al.add(triplets);
                    left ++;
                    right--;
                }
                else if(currentSum < targetSum){
                    left ++;
                }
                else{
                    right--;
                }
            }
        }
        return al;
    }
}

