import java.util.ArrayList;
import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }
    public static int sum(ArrayList<Integer> numbers){
        int total = 0;
        for(int i = 0; i < numbers.size(); i++){
            total += numbers.get(i);
        }
        return total;
    }
}
