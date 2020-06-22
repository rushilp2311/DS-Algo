public class CountAndSay {
    public static String countAndSay(int n){
        return countAndSay("1",n);
    }
    public static String countAndSay(String value, int input){
        if(input == 1){
            return value;
        }
        else{
            String result = "";
            char [] stringToCharArray = value.toCharArray();
            char val = stringToCharArray[0];
            int count = 0;
            StringBuilder sb = new StringBuilder();
            for(char output : stringToCharArray){
                if(output == val){
                    count ++ ;
                }
                else{
                    sb.append(count);
                    sb.append(val);
                    val = output;
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(val);
            result = sb.toString();
            return --input == 1 ? result : countAndSay(result,input);
        }

    }

    public static void main(String[] args) {
        System.out.println(CountAndSay.countAndSay(1));
    }
}
