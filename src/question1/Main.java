package question1;

public class Main {
    public static void main(String[] args) {

        Payment cash = new CashPayment(101.99);
        cash.paymentDetails();
        Payment cash2 = new CashPayment(20.99);
        cash2.paymentDetails();

        Payment credit = new CreditCardPayment("ali", "21 december", "12345", 120.99);
        credit.paymentDetails();
        Payment credit2 = new CreditCardPayment("ben", "2020-10-10", "123098", 50.98);
        credit2.paymentDetails();
    }
}
