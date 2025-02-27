package question1;

public class CashPayment extends Payment{

    //constructor
    public CashPayment(double amount){
        super(amount);
    }

    //methods
    @Override
    public void paymentDetails() {
        System.out.println("the customer wants to pay the amount " + amount + " in cash");
    }
}
