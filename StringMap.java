import java.util.*;

public class StringMap {
    public static void Stringmap(String input) {

        Map<String, List<String>> map = new HashMap<>();

        for (String outer : splitBy(input, " \\| ")) {
            List<String> inner = splitBy(outer, ":");
            List<String> newList = splitBy(inner.get(1),",");
            if (inner.size() == 2) {
                String key = inner.get(0);
                map.put(key, newList);
            }
        }

        for(String s : map.keySet()){
            System.out.println(s+"->"+map.get(s));
        }
    }
    private static List<String> splitBy(String toSplit, String delimiter) {
        List<String> tokens = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(toSplit, delimiter);
        while (tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }
        return tokens;
    }


    public static void main(String[] args) {
    StringMap.Stringmap("Brand1:p1,p2|Brand2:p2,p3");
    }
}
