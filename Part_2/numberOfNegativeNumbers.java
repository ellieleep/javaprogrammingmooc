import java.util.Scanner;

public class numberOfNegativeNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int negativeCount = 0;
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number < 0){
                negativeCount = negativeCount + 1;
            }
            if(number == 0){
                break;
            }
        }
        System.out.println("Number of negative numbers: "+negativeCount);
    }
}
