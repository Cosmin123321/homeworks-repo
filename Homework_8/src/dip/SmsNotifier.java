package dip;

public class SmsNotifier extends NotificationService {

    public void sendSms(String message) {
        System.out.println("SMS sent: " + message);
    }

}
