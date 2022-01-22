import java.util.Scanner;

public class printThrice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a word: ");
        String word = scanner.nextLine();
        System.out.println(word+word+word);
    }
}
