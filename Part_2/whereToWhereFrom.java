import java.util.Scanner;

public class whereToWhereFrom {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int whereTo = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int whereFrom = Integer.valueOf(scanner.nextLine());
        for(int x = whereFrom; x <= whereTo; x++){
            System.out.println(x);
        }
    }
}
