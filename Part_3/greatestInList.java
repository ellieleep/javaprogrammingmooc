import java.util.ArrayList;
import java.util.Scanner;

public class greatestInList {
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

        int largest = numList.get(0);

        for(int i = 0; i < numList.size()-1; i++){
                if(numList.get(i) > largest){
                    largest = numList.get(i);
                }
        }

        System.out.println("The greatest number: "+ largest);
    }
}
