import java.util.ArrayList;
import java.util.Scanner;

public class listSize {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();

        while(true){
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            nameList.add(name);
        }
        System.out.println("In total: "+nameList.size());
    }
}
