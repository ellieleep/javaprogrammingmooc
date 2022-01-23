public class Gauge {
    private int value;
    public Gauge(){
        this.value = 0;
    }
    public void increase(){
        this.value++;
    }
    public void decrease(){
        this.value--;
    }
    public int value(){
        return value;
    }
    public boolean full(){
        return value == 5;
    }
    public static void main(String[] args){
        Gauge g = new Gauge();

        while(!g.full()) {
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }

        System.out.println("Full! Value: " + g.value());
        g.decrease();
        System.out.println("Not full! Value: " + g.value());
    }
}
