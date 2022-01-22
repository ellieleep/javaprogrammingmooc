import java.util.ArrayList;
import java.util.Scanner;

public class firstAndLast {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        while(true){
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            else{
                nameList.add(name);
            }
        }

        System.out.println(nameList.get(0));
        System.out.println(nameList.get(nameList.size()-1));
    }
}
