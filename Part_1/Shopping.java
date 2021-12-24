import java.util.Scanner;

public class Shopping {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chicken:");
        String numChickens = scanner.nextLine();
        System.out.println("Bacon (kg):");
        String chickensWeight = scanner.nextLine();
        System.out.println("Tractor:");
        String tractor = scanner.nextLine();
        System.out.println("And finally, a summary:");
        System.out.println(numChickens);
        System.out.println(chickensWeight);
        System.out.println(tractor);
    }
}
