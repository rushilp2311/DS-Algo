import java.util.List;

public class ValidateSubsequence {
    public static boolean isValidSubsequence(List<Integer> array,List<Integer> sequence){
        int indexSeq = 0;
        int indexArr = 0;

        while(indexSeq < sequence.size() && indexArr < array.size()){
            if(array.get(indexArr) == sequence.get(indexSeq)){
                indexSeq++;
            }
            indexArr++;
        }
        return indexSeq == sequence.size();
    }
}
