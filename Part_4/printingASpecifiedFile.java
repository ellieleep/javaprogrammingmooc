import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class printingASpecifiedFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String line = scanner.nextLine();
        if(line.equals("song.txt")){
            try(Scanner file = new Scanner(Paths.get(".idea/song.txt"))){
                while(file.hasNextLine()){
                    String sLine = file.nextLine();
                    System.out.println(sLine);
                }
            }
            catch (Exception e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        else if(line.equals("data.txt")){
            try(Scanner file = new Scanner(Paths.get(".idea/data.txt"))){
                while(file.hasNextLine()){
                    String dLine = file.nextLine();
                    System.out.println(dLine);
                }
            }
            catch (Exception e){
                System.out.println("Error: "+e.getMessage());
            }
        }
    }
}
