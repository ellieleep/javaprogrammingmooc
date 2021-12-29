import java.util.Scanner;

public class numberOfNumbers {
    public static void main(String[] args){
        int count = 0;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }
            count = count + 1;
        }
        System.out.println("Number of numbers: "+count);
    }
}
