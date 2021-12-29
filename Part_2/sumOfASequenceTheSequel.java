import java.util.Scanner;

public class sumOfASequenceTheSequel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number?");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Last Number");
        int lastNum = Integer.valueOf(scanner.nextLine());
        int runningSum = 0;
        for(int x = firstNum; x <= lastNum; x++){
            runningSum += x;
        }
        System.out.println("The sum is: "+runningSum);
    }
}
