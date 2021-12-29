import java.math.*;

public class divisibleByThree {
    public static void main(String[] args){
        divisibleByThreeInRange(2,10);
    }
    public static void divisibleByThreeInRange(int beginning, int end){
        for(int x = beginning; x <= end; x++){
            if(x%3==0){
                System.out.println(x);
            }
        }
    }
}
