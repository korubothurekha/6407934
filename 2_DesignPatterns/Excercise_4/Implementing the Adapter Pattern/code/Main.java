
public class Main {
    public static void main(String[] args) {
        PaymentProcessor razorpayProcessor = new RazorpayAdapter();
        razorpayProcessor.processPayment(2500);

        PaymentProcessor stripeProcessor = new StripeAdapter();
        stripeProcessor.processPayment(2500);
    }
}
