import java.util.ArrayList;
import java.util.Scanner;

public class onlyTheseNumbers {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while(true) {
            int currentNum = Integer.valueOf(scanner.nextLine());

            if (currentNum == -1) {
                break;
            } else {
                numList.add(currentNum);
            }
        }
            System.out.println("From where?");
            int start = Integer.valueOf(scanner.nextLine());
            System.out.println("To where?");
            int end = Integer.valueOf(scanner.nextLine());

            for(int i = start; i <= end; i++){
                System.out.println(numList.get(i));
            }
    }
}
