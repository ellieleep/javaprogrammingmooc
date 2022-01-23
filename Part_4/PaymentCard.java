public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
        this.balance = openingBalance;
    }

    @Override
    public String toString() {
        // write code here
        return "The card has a blance of "+this.balance+" euros";
    }

    public void eatAffordably() {
        // write code here
        if(this.balance - 2.60 >= 0){
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        // write code here
        if(this.balance - 4.60 >= 0){
            this.balance -= 4.60;
        }

    }
    public void addMoney(double amount) {
        // write code here
        if(this.balance+amount > 150){
            this.balance = 150;
        }
        else if(amount > 0){
            this.balance+=amount;
        }
    }

    public static void main(String[] args){
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println(paulsCard);
        System.out.println(mattsCard);
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println(paulsCard);
        System.out.println(mattsCard);
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println(paulsCard);
        System.out.println(mattsCard);
    }
}
