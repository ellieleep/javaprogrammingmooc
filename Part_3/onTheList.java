import java.util.ArrayList;
import java.util.Scanner;

public class onTheList {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        while(true){
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            else{
                names.add(name);
            }
        }
        System.out.println("Search for?");
        String search = scanner.nextLine();
        if(names.contains(search)){
            System.out.println(search + " was found!");
        }
        else{
            System.out.println(search + " was not found!");
        }
    }
}
