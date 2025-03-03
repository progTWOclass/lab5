package question1;

public class Payment {

    protected double amount;

    //constructor
    public Payment(double amount){
        this.amount = amount;
    }


    //getters and setters
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }

    //methods
    public void paymentDetails(){
        System.out.printf("the payment amount is %.2f\n", getAmount());
    }
}