public class Timer {
    private ClockHand seconds;
    private ClockHand hundredths;
    public Timer(){
        this.seconds = new ClockHand(60);
        this.hundredths = new ClockHand(100);
    }
    @Override
    public String toString(){
        return this.seconds+":"+this.hundredths;
    }
    public void advance(){
        this.hundredths.advance();
        if(this.hundredths.value() == 0){
            this.seconds.advance();
        }
    }
    public static void main(String[] args){
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}
