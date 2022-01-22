import java.util.Scanner;

public class ageOfTheOldest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String oldestName = "";
        int oldestAge = 0;
        while(true){
            String line = scanner.nextLine();
            if(line.equals("")){
                break;
            }
            String[] roster = line.split(",");
            String name = roster[0];
            int age = Integer.valueOf(roster[1]);
            if(age > oldestAge){
                oldestName = name;
                oldestAge = age;
            }
        }
        System.out.println("Name of the oldest: "+oldestName);
    }
}
