import java.util.Scanner;

public class additionFormula {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
    }
}