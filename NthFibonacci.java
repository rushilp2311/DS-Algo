import java.util.HashMap;
import java.util.Map;

public class NthFibonacci {
    //Simple Recursion
    public static int getNthFib1(int n){
        if(n == 2) return 1;
        else if (n == 1) return 0;
        else return getNthFib1(n-1) + getNthFib1(n-2);
    }
    //Dynamic Programming
    public static int getNthFib2(int n){
        Map<Integer,Integer> memoize = new HashMap<>();
        memoize.put(1,0);
        memoize.put(2,1);
        return getNthFibHelper(n,memoize);
    }
    public static int getNthFibHelper(int n , Map<Integer, Integer> memoize){
        if(memoize.containsKey(n)){
            return memoize.get(n);
        }
        else{
            memoize.put(n,getNthFibHelper(n-1,memoize)+getNthFibHelper(n-2,memoize));
            return memoize.get(n);
        }
    }

    // Iterative Solution
    public static int getNthFib(int n){
        int[] lastTwo = {0,1};
        int counter = 3;
        while(counter <=n){
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter++;
        }
        return n > 1 ? lastTwo[1] : lastTwo[0];
    }
}
