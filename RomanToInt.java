import java.util.HashMap;

public class RomanToInt {
    public static int RomanToInt(String s){
        int len = s.length();
        if(len == 0)
            return 0;
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        if(len == 1)
            return map.get(s.charAt(0));
        for(int i = 0; i < len - 1;i++)
        {
            int curr = map.get(s.charAt(i));
            int next = map.get(s.charAt(i+1));
            if(curr < next)
                res -= curr;
            else
                res += curr;
        }
        return res + map.get(s.charAt(len-1));

    }

}
