package Behaviours;

import java.util.List;

public interface ISocialMedia {
    public List<String> fetchNotifications();
    public void markNotificationAsRead(int notificationId);
    public void markNotificationAsUnread(int notificationId);
    public void deleteNotification(int notificationId);
    public void addNotification(int notificationId, String message);
}
