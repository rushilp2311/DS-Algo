import java.util.ArrayList;
import java.util.List;

public class Coursera {
    public List<Integer> mystery (List<String> letter){
        List<Integer> result = new ArrayList<>();
        for(String s : letter){
            if(checkPalindrome(s)){
                result.add(0);
                System.out.println("Yes it is palindrome");
            }else {
                int convert = makePalindrome(s);
                result.add(convert);
            }
        }
        return result;

    }
    public int makePalindrome(String str){
        int count = 0;
        int ptr1 = 0;
        int ptr2 = str.length()-1;
        while(ptr1 < ptr2){

             if(str.charAt(ptr1) < str.charAt(ptr2)){
                count += str.charAt(ptr2) - str.charAt(ptr1);

            }
            else if (str.charAt(ptr1) > str.charAt(ptr2)){
                count += str.charAt(ptr1) - str.charAt(ptr2);

            }
            ptr1++;
            ptr2--;

        }
        return count;

    }
    public boolean checkPalindrome(String str){
        boolean result = false;
        if(str.length()<=2){
            return true;
        }
        for(int i = 0;i<(int)str.length()/2;i++){
            if(str.charAt(i) == str.charAt(str.length()-i-1)){
                result = true;
            }
            else{

                break;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        List<String> letter = new ArrayList<>();
        letter.add("krvjwcgucyuszipnetyqbbhqdtqgjgwvarfyvnsxnpsnxhcbcdtdebviwmo");
        Coursera c = new Coursera();
       List<Integer> res =  c.mystery(letter);
        System.out.println(res.get(0));
    }
}
