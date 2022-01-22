import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        int[] numbers = new int[5];
        numbers[0] = Integer.valueOf(reader.nextLine());
        numbers[1] = Integer.valueOf(reader.nextLine());
        numbers[2] = Integer.valueOf(reader.nextLine());
        numbers[3] = Integer.valueOf(reader.nextLine());
        numbers[4] = Integer.valueOf(reader.nextLine());

        System.out.println("Give two indices to swap");
        int first = Integer.valueOf(reader.nextLine());
        int second = Integer.valueOf(reader.nextLine());

        int helper = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = helper;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
    }
}
