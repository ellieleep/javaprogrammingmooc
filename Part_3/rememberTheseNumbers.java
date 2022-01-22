import java.util.ArrayList;
import java.util.Scanner;

public class rememberTheseNumbers {
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

        for(int i = 0; i < numList.size(); i++){
            System.out.println(numList.get(i));
        }
    }
}
