import java.util.Scanner;

public class lastWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line.equals("")){
                break;
            }
            String[] lineSplit = line.split(" ");
            System.out.println(lineSplit[lineSplit.length-1]);
        }
    }
}