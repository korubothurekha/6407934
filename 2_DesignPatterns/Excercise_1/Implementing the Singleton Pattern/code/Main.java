public class Main {
    public static void main(String[] args) {
        // Attempt to get Logger instances
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message : Hello Bestie");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message : Hey Hello");

        // Checking if both references point to the same object
        if (logger1 == logger2) {
            System.out.println("Both loggers are the same instance (Singleton works).");
        } else {
            System.out.println("Different instances (Singleton failed).");
        }
    }
}
