public class Logger {
    // Step 1: Private static instance (only one)
    private static Logger instance;

    // Step 2: Private constructor to prevent external instantiation
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Public method to return the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // lazy initialization
        }
        return instance;
    }

    // Example method to log messages
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
