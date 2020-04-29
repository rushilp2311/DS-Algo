public class MoveZeros {
    public static void moveZeros(int[] nums) {
//        int counter = 0;
//
//        for(int i = nums.length-1; i >= 0;i-- ){
//            if(nums[i] == 0){
//                counter = i;
//                while(counter < nums.length-1){
//                    int temp = 0;
//                    temp = nums[counter];
//                    nums[counter] = nums[counter+1];
//                    nums[counter+1] = temp;
//                    counter++;
//                }
//            }
//        }
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] !=0){
                nums[count] = nums[i];
                count++;
            }

        }
        while(count < nums.length){
            nums[count++] = 0;
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
