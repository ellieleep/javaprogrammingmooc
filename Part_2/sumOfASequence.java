import java.util.Scanner;

public class sumOfASequence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int number = Integer.valueOf(scanner.nextLine());
        int runningSum = 0;
        for(int x = 1; x <= number; x++){
            runningSum+=x;
        }
        System.out.println("The sum is " + runningSum);
    }
}
