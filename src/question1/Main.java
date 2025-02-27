package question1;

public class Main {
    public static void main(String[] args) {

        Payment cash = new CashPayment(101.99);
        cash.paymentDetails();

        Payment credit = new CreditCardPayment("ali", "21 december", 12345, 111.99);
        credit.paymentDetails();
    }
}
