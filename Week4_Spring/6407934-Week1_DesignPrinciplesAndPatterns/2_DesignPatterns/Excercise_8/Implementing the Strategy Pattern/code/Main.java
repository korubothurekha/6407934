public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Use Credit Card strategy
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "Rekha Korubothu"));
        context.processPayment(2500);

        System.out.println();

        // Switch to PayPal strategy
        context.setPaymentStrategy(new PayPalPayment("rekha@paypal.com"));
        context.processPayment(1200);
    }
}
