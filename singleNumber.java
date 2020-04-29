
public class singleNumber {
    public int Number(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        // for(int i : nums){
        // map.put(i,map.get(i) == null ? 1 : map.get(i)+1);
        // }
        //
        // for(int i : map.keySet()){
        // if (map.get(i) == 1) return i;
        // }
        // return 0;

        // Better approach is bit manipulation using XOR
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;

    }

    public static void main(String[] args) {
        singleNumber s = new singleNumber();
        int[] n = { 4, 2, 1, 2 };
        System.out.println(s.Number(n));
    }
}
