package question1;

import java.sql.SQLOutput;

public class CreditCardPayment extends Payment{

    //class variable
    protected String nameCard;
    protected String expirationDate;
    protected String cardNumber;

    //constructor
    public CreditCardPayment(String nameCard, String expirationDate, String cardNumber, double amount){
        super(amount);
        this.nameCard = nameCard;
        this.expirationDate = expirationDate;
        this.cardNumber = cardNumber;
    }

    //getters and setters
    public String getNameCard(){
        return nameCard;
    }
    public void setNameCard(String nameCard){
        this.nameCard = nameCard;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    //methods
    @Override
    public void paymentDetails() {
        System.out.println("Paymant was done by credit card:");
        System.out.println("Customer name: " + getNameCard());
        System.out.println("card expiration date: " + getExpirationDate());
        System.out.println("Customer cardNumber: " + getCardNumber());

        System.out.println("the customer " +getNameCard()+ " wants to pay the amount " + amount + " in cash");
    }
}
