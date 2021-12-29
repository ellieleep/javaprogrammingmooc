import java.util.Scanner;

public class numberAndSumOfNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numNums = 0;
        int sumOfNums = 0;
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }
            numNums = numNums + 1;
            sumOfNums = sumOfNums + number;
        }
        System.out.println("Number of numbers: "+ numNums);
        System.out.println("Sum of the numbers: "+ sumOfNums);
    }
}
