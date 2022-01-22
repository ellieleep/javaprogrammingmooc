import java.util.ArrayList;
import java.util.Scanner;

public class indexOf {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while(true){
            int currentNum = Integer.valueOf(scanner.nextLine());
            if(currentNum == -1){
                break;
            }
            else {
                numList.add(currentNum);
            }
        }

        System.out.println("Search for?");
        int searchValue = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i < numList.size()-1; i++){
            if(numList.get(i) == searchValue){
                System.out.println(searchValue + " is at index " + i);
            }
        }
    }
}
