import java.util.Scanner;

public class avClub {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line == ""){
                break;
            }
            String[] avSplit = line.split(" ");
            for(int i = 0; i<avSplit.length; i++){
                if(avSplit[i].contains("av")){
                    System.out.println(avSplit[i]);
                }
            }
        }
    }
}
