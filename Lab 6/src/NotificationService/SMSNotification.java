package NotificationService;

import Interface.INotify;

public class SMSNotification implements INotify {
    @Override
    public void sendNotification(String receiver, String message) {
        System.out.println("SMS Notification for " + receiver + ": " + message);
    }
}
