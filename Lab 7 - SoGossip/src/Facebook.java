import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Facebook extends SocialMediaAdapter{
    private Map<Integer, String> notifications = new HashMap<>();

    public void addNotification(int notificationId, String message) {
        notifications.put(notificationId, message);
        System.out.println("Added Facebook notification " + notificationId + ": " + message);
    }

    @Override
    public List<String> fetchNotifications() {
        return new ArrayList<>(notifications.values());
    }

    @Override
    public void markNotificationAsRead(int notificationId) {
        if (notifications.containsKey(notificationId)) {
            System.out.println("Marked Facebook notification " + notificationId + " as read.");
        } else {
            System.out.println("Notification ID " + notificationId + " does not exist.");
        }
    }

    @Override
    public void deleteNotification(int notificationId) {
        if (notifications.remove(notificationId) != null) {
            System.out.println("Deleted Facebook notification " + notificationId);
        } else {
            System.out.println("Notification ID " + notificationId + " does not exist.");
        }
    }
}
