package dip;

public class Main {
    public static void main(String[] args) {
        PaymentMethod emailPayment = new CreditCardPayment();
        PaymentMethod smsPayment = new PayPalPayment();
        PaymentMethod cryptoPayment = new CryptoPayment();

        PaymentProcessor emailProcessor = new PaymentProcessor(emailPayment);
        PaymentProcessor smsProcessor = new PaymentProcessor(smsPayment);
        PaymentProcessor cryptoProcessor = new PaymentProcessor(cryptoPayment);

        emailProcessor.makePayment(150.0);
        smsProcessor.makePayment(200.0);
        cryptoProcessor.makePayment(300.0);
    }
}