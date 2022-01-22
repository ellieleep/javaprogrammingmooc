import java.util.Scanner;

public class personalDetails {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int longestNameLength = 0;
        int sumOfYears = 0;
        int numberOfUsers = 0;
        while(true){
            String line = scanner.nextLine();
            if(line.equals("")){
                break;
            }
            String[] lineSplit = line.split(",");
            if(Integer.valueOf(lineSplit[0].length())>longestNameLength){
                longestName = lineSplit[0];
                longestNameLength = Integer.valueOf(lineSplit[0].length());
            }
            sumOfYears += Integer.valueOf(lineSplit[1]);
            numberOfUsers++;
        }
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: "+(double)sumOfYears/numberOfUsers);
    }
}
