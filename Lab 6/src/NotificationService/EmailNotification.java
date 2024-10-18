package NotificationService;

import Interface.INotify;

import java.io.Console;

public class EmailNotification implements INotify {
    @Override
    public void sendNotification(String receiver, String message) {
        System.out.println("Email Notification for " + receiver + ": " + message);
    }
}
