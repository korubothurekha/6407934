


public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripe;

    public StripeAdapter() {
        this.stripe = new StripeGateway();
    }

    @Override
    public void processPayment(double amount) {
        double dollarAmount = amount / 83.0; // Assuming ₹1 = $0.012
        stripe.makeStripePayment(dollarAmount);
    }
}
