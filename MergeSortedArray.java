import java.util.Arrays;

public class MergeSortedArray {
    public static void mergeSortedArray(int[] nums1,int m, int[] nums2,int n){
        int j = 0;
        for(int i = m;i<nums1.length;i++,j++){
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}
