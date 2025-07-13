public class SMSNotifierDecorator extends NotifierDecorator {

    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // send original
        sendSMS(message);    // then extra functionality
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
