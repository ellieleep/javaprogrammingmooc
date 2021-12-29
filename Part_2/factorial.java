import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int factNum = Integer.valueOf(scanner.nextLine());
        int runningTotal = 1;
        for(int x = 1; x <= factNum; x++){
            runningTotal *= x;
        }
        System.out.println("Factorial: "+runningTotal);
    }
}
