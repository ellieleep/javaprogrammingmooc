import java.util.Scanner;

public class reprint {
    public static void main(String[] args){
        System.out.println("How many times?");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        int count = 0;
        while(true){
            if(count == number){
                break;
            }
            printText();
            count++;
        }
    }
    public static void printText(){
        System.out.println("In a hole in the ground there lived a method");
    }
}
