public class smallest {
    public static void main(String[] args){
        int answer = smallest(2, 7);
        System.out.println("Smallest: "+answer);
    }
    public static int smallest(int firstNum, int secondNum){
        if(firstNum < secondNum){
            return firstNum;
        }
        else{
            return secondNum;
        }
    }
}
