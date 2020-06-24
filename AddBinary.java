public class AddBinary {
    public static String addBinary(String a,String b){
        int alength = a.length();
        int blength = b.length();
        int i = alength - 1;
        int j = blength - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(i >= 0 || j >=0){
            int ival = 0;
            int jval = 0;
            if(i >= 0 ){
                if(a.charAt(i) == '1'){
                    ival = 1;
                }
            }
            if(j >= 0 ){
                if(a.charAt(j) == '1'){
                    jval = 1;
                }
            }
            int res = ival + jval + carry;
            if(res > 1){
                carry = 1;
            }
            else{
                carry = 0;
            }
            result.insert(0,res%2);
            i--;
            j--;
        }
        if(carry > 0){
            result.insert(0,carry);
        }
        return result.toString();

    }
}
