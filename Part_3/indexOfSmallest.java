import java.util.ArrayList;
import java.util.Scanner;

public class indexOfSmallest {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while (true) {
            int currentNum = Integer.valueOf(scanner.nextLine());
            if (currentNum == 9999) {
                break;
            } else {
                numList.add(currentNum);
            }
        }
        int smallest = numList.get(0);

        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) < smallest) {
                smallest = numList.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
