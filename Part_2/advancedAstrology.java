public class advancedAstrology {
    public static void main(String[] args){
        printTriangle(4);
        System.out.println();
        christmasTree(4);
    }
    public static void printSpaces(int number){
        for(int x = 0; x < number; x++) {
            System.out.print(" ");
        }
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
    public static void printTriangle(int size){
        for(int x = 1; x <= size; x++){
            printSpaces(size - x);
            printStars(x);
        }
    }
    public static void christmasTree(int height){
        for(int x = 1; x <= height; x++){
            printSpaces(height-x);
            printStars(x);
        }
    }
}
