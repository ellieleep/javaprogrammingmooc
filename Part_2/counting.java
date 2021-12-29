import java.net.Inet4Address;
import java.util.Scanner;

public class counting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        for(int x = 0; x <= number; x++){
            System.out.println(x);
        }
    }
}
