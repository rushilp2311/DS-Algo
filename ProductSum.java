import java.util.ArrayList;

public class ProductSum {
    public static int productSum(ArrayList<Object> list){
        return productSumHelper(list,1);
    }
    public static int productSumHelper(ArrayList<Object> array, int multiplier){
        int sum = 0;
        for(Object a : array){
            if(a instanceof ArrayList){
                sum += productSumHelper((ArrayList<Object>) a,multiplier+1);
            }
            else{
                sum += (int) a;
            }
        }
        return sum * multiplier;
    }
}
