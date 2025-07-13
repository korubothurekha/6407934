public class Forecast {

    // Recursive method to calculate future value
    public static double futureValue(double amount, double rate, int years) {
        // Base case
        if (years == 0) {
            return amount;
        }

        // Recursive case
        return futureValue(amount * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) 
    {
        double initialAmount = 10000; // ₹10,000
        double annualRate = 0.05;     // 5% growth rate
        int forecastYears = 3;

        double result = futureValue(initialAmount, annualRate, forecastYears);

        System.out.println("Forecasted value after " + forecastYears + " years: Rs." + String.format("%.2f", result));
    }
}
