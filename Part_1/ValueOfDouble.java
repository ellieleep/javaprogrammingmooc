import java.util.Scanner;

public class ValueOfDouble {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Give a number:");
        double number = Double.valueOf(in.nextLine());
        System.out.println("You gave the number: " + number);
    }
}
