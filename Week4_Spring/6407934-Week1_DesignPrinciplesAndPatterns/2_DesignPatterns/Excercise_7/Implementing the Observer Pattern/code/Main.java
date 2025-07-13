//Main.java – Test the Observer Pattern

public class Main {
    public static void main(String[] args) {
        // Create stock market object
        StockMarket tcsStock = new StockMarket("Cognizant");

        // Create observers
        Observer mobileUser = new MobileApp("Rekha");
        Observer webUser = new WebApp("Priya");

        // Register observers
        tcsStock.registerObserver(mobileUser);
        tcsStock.registerObserver(webUser);

        // Simulate stock updates
        tcsStock.setPrice(3500.75);
        tcsStock.setPrice(3600.00);

        // Remove one observer
        tcsStock.removeObserver(webUser);

        // Another update
        tcsStock.setPrice(3650.50);
    }
}
