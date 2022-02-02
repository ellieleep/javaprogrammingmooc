import java.nio.file.Paths;
import java.util.Scanner;

public class numbersFromAFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("File?");
        String fileName = scanner.nextLine();
        System.out.println("Lower bound?");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound?");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;
        try(Scanner file = new Scanner(Paths.get("Part_4/"+fileName))){
            while(file.hasNextLine()){
                int num = Integer.valueOf(file.nextLine());
                if(num >= lowerBound && num <= upperBound){
                    count++;
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Numbers: " + count);
    }
}
