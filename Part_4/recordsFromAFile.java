import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class recordsFromAFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> personList = new ArrayList<>();
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try(Scanner fileName = new Scanner(Paths.get("Part_4/"+file))){
            while(fileName.hasNext()){
                String fileLine[] = fileName.nextLine().split(",");
                String name = fileLine[0];
                int age = Integer.valueOf(fileLine[1]);
                System.out.println(name+", age: "+age+" years");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
