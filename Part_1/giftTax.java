import java.util.Scanner;

public class giftTax {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scanner.nextLine());
        double totalTax = 0.0;
        if(giftValue >= 1000000){
            totalTax = (142100 + (giftValue-1000000)*.17);
        } else if(giftValue < 1000000 && giftValue >= 200000){
            totalTax = (22100 + (giftValue-200000)*.15);
        } else if(giftValue < 200000 && giftValue >= 55000){
            totalTax = (4700 + (giftValue-55000)*.12);
        } else if(giftValue < 55000 && giftValue >= 25000){
            totalTax = (1700 + (giftValue-25000)*.10);
        } else if(giftValue < 25000 && giftValue >= 5000){
            totalTax = (100 + (giftValue-5000)*.8);
        }
        else {
            totalTax = 0;
        }
        if(totalTax != 0){
            System.out.println("Tax: " + totalTax);
        }
        else{
            System.out.println("No tax!");
        }
    }
}
