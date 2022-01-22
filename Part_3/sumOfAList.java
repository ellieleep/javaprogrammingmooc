import java.util.ArrayList;
import java.util.Scanner;

public class sumOfAList {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while(true){
            int currentNum = Integer.valueOf(scanner.nextLine());
            if(currentNum == -1){
                break;
            }
            else{
                numList.add(currentNum);
            }
        }
        int sum = 0;
        for(Integer num: numList){
            sum += num;
        }
        System.out.println("Sum: "+sum);
    }
}
