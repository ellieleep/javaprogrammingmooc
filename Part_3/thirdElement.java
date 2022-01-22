import java.util.ArrayList;
import java.util.Scanner;

public class thirdElement {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<String>();

        while(true){
            String line = scanner.nextLine();
            if(line == ""){
                break;
            }
            arrayList.add(line);
        }

        System.out.println(arrayList.get(2));
    }
}
