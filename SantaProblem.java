import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SantaProblem {
    public static void partOne(List<Integer> list){
        int sum =0;
        for(int mass : list){
            sum += (mass / 3) -2;
        }
        System.out.println(sum);
    }
   public static void partTwo(List<Integer> list){
       int sum = 0;
       for (int mass: list) {
           while ((mass = (mass / 3) - 2) > 0)
               sum += mass;
       }
       System.out.println(sum);
   }

    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("/home/rushildp/DSAlgo/santaInput");
        Scanner myReader = new Scanner(myObj);
        int result = 0;
        List<Integer> list = new ArrayList<>();

        while(myReader.hasNextLine()){
            String data = myReader.nextLine();
            list.add(Integer.parseInt(data));
        }
        SantaProblem.partTwo(list);
    }
}
