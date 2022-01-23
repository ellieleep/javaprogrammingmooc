import java.util.Scanner;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
       this.count = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average(){
        return (double)this.sum()/this.getCount();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statisticsAll = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();

        while(true){
            int value = Integer.valueOf(scanner.nextLine());
            if(value == -1){
                break;
            }
            statisticsAll.addNumber(value);
            if(value % 2 == 0){
                statisticsEven.addNumber(value);
            }
            else{
                statisticsOdd.addNumber(value);
            }
        }

        System.out.println("Sum: "+statisticsAll.sum());
        System.out.println("Sum of even numbers: "+statisticsEven.sum());
        System.out.println("Sum of odd numbers: "+statisticsOdd.sum());
    }
}