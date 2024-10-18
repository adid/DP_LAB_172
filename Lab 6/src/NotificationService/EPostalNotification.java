package NotificationService;

import Interface.INotify;

public class EPostalNotification{

    public void sendNotification(String receiver, String message, String address) {
        System.out.println("E-Postal Email to be sent: " + address);
        System.out.println("E-Postal Email Notification for " + receiver + ": " + message);
    }
}
