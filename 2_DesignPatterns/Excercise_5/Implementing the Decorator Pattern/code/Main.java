public class Main {
    public static void main(String[] args) {
        // a) Basic Email Notifier
        Notifier basicNotifier = new EmailNotifier();

        // b) Decorate it with SMS
        Notifier smsNotifier = new SMSNotifierDecorator(basicNotifier);

        // c) Further decorate with Slack
        Notifier multiNotifier = new SlackNotifierDecorator(smsNotifier);

        // d) Send notification
        multiNotifier.send("System is down! Immediate action required.");
    }
}

