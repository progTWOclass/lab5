package question1;

public class CreditCardPayment extends Payment{

    //class variable
    protected String nameCard;
    protected String expirationDate;
    protected int cardNumber;

    //constructor
    public CreditCardPayment(String nameCard, String expirationDate, int cardNumber, double amount){
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

    public int getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    //methods
    @Override
    public void paymentDetails() {
        System.out.println("Customer name: " + getAmount());
        System.out.println("card expiration date: " + getExpirationDate());
        System.out.println("Customer cardNumber: " + getCardNumber());

        System.out.println("the customer " +getNameCard()+ " wants to pay the amount " + amount + " in cash");
    }
}
