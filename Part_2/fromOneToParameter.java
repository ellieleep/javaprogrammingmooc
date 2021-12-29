import java.util.Scanner;

public class fromOneToParameter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        printUntilNumber(2);
    }
    public static void printUntilNumber(int number){
        for(int x = 1; x <= number; x++){
            System.out.println(x);
        }
    }
}
