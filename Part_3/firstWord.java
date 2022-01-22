import java.util.Scanner;

public class firstWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line.equals("")){
                break;
            }
            String[] lineSplit = line.split(" ");
            System.out.println(lineSplit[0]);
        }
    }
}
