package dip;

public class EmailNotifier extends NotificationService{

    public void sendEmail(String message) {
        System.out.println("Email sent: " + message);
    }

}