import java.util.Scanner;

public class averageOfNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int countOfNumbers = 0;
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }
            if(number < 0){
                continue;
            } else {
                sumOfNumbers = sumOfNumbers + number;
                countOfNumbers = countOfNumbers + 1;
            }
        }
        if(sumOfNumbers <= 0){
            System.out.println("Cannot calculate the average");
        }
        System.out.println((double)sumOfNumbers/countOfNumbers);
    }
}
