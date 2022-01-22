import java.util.Scanner;

public class indexWasNotFound {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] numbers = new int[4];
            numbers[0] = 42;
            numbers[1] = 13;
            numbers[2] = 12;
            numbers[3] = 7;

            System.out.println("Search for?");
            int search = Integer.valueOf(scanner.nextLine());
            boolean found = false;
            int foundIndex = 0;

            for(int i = 0; i < numbers.length; i++){
                if(numbers[i] == search){
                    found = true;
                    foundIndex = i;
                }
            }

            if(found){
                System.out.println(search+" is at index "+foundIndex+".");
            }
            else {
                System.out.println(search+" was not found.");
            }
    }
}
