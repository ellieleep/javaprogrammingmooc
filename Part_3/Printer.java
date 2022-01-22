public class Printer {
    public static void main(String[] args){
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
    public static void printArrayInStars(int[] array){
        for(int i=0;i<array.length;i++){
            for(int starCounter=0;starCounter<array[i];starCounter++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
