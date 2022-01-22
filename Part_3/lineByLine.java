import java.util.Scanner;

public class lineByLine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line==""){
                break;
            }
            String[] wsSplit = line.split(" ");
            for(int i=0;i<wsSplit.length;i++){
                System.out.println(wsSplit[i]);
            }
        }
    }
}
