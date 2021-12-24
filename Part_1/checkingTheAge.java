import java.util.Scanner;

public class checkingTheAge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.valueOf(scanner.nextLine());
        if(age < 120 && age > 0){
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
