public class isPalindrome {
    public static boolean palindromCheck(String str){
        boolean result = false;
        for(int i =0 ;i< (int)str.length()/2;i++){
            if(str.charAt(i) == str.charAt(str.length()-i-1)){
                result = true;
            }
            else{
                result = false;
                break;
            }
        }
        return result;
    }
}
