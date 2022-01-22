import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Scanner;

public class lastInList {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namesList = new ArrayList<>();
        while (true){
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            namesList.add(name);
        }

        System.out.println(getLast(namesList));
    }

    public static String getLast(ArrayList<String> nameList){
        return nameList.get(nameList.size()-1);
    }
}


