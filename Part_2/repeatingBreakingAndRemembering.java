import java.util.Scanner;

public class repeatingBreakingAndRemembering {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int runningSum = 0;
        int numNums = 0;
        int numEven = 0;
        int numOdd = 0;
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                break;
            }
            runningSum += num;
            numNums++;
            if(num%2 == 0){
                numEven++;
            }
            else { numOdd++; }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + runningSum);
        System.out.println("Numbers: " + numNums);
        System.out.println("Average: " + (double)runningSum/numNums);
        System.out.println("Even: "+numEven);
        System.out.println("Odd: "+numOdd);
    }
}
