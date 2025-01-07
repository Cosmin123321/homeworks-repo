package dip;

public class NotificationService extends Notifications{

    private EmailNotifier emailNotifier = new EmailNotifier();

    public void notify(String message) {
        emailNotifier.sendEmail(message);
    }

}