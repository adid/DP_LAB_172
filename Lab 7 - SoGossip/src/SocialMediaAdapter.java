import java.util.List;

public abstract class SocialMediaAdapter {
    abstract List<String> fetchNotifications();
    abstract void markNotificationAsRead(int notificationId);
    abstract void deleteNotification(int notificationId);
    abstract void addNotification(int notificationId, String message);
}
