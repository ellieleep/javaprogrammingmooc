public class starSign {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println();
        printSquare(4);
        System.out.println();
        printRectangle(17, 3);
        System.out.println();
        printTriangle(4);
    }
    public static void printStars(int number) {
        // you can print one star with the command
        // System.out.print("*");
        // call the print command n times
        // in the end print a line break with the comand
        // System.out.println("");
        for(int x = 0; x < number; x++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printSquare(int size){
        for(int x = 0; x < size; x++){
            printStars(size);
        }
    }
    public static void printRectangle(int width, int height){
        for(int x = 0; x < height; x++){
            printStars(width);
        }
    }
    public static void printTriangle(int size){
        for(int x = 1; x <= size ; x++){
            printStars(x);
        }
    }
}
