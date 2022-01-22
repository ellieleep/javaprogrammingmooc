import java.util.ArrayList;
import java.util.Scanner;

public class secondPlusThird {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }
            arrayList.add(num);
        }

        System.out.println(arrayList.get(1)+arrayList.get(2));
    }
}
