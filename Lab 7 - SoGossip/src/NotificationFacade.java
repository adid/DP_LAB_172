import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationFacade {
    private Map<String, SocialMediaAdapter> adapters;

    public NotificationFacade() {
        adapters = new HashMap<>();
        adapters.put("twitter", new Twitter());
        adapters.put("facebook", new Facebook());
    }

    public void addNotification(String platform, int notificationId, String message) {
        SocialMediaAdapter adapter = adapters.get(platform.toLowerCase());
        if (adapter != null) {
            adapter.addNotification(notificationId, message);
        } else {
            System.out.println("Platform not supported: " + platform);
        }
    }

    public List<String> fetchAllNotifications() {
        List<String> allNotifications = new ArrayList<>();

        for (Map.Entry<String, SocialMediaAdapter> entry : adapters.entrySet()) {
            String platform = entry.getKey();
            SocialMediaAdapter adapter = entry.getValue();

            for (String notification : adapter.fetchNotifications()) {
                allNotifications.add(platform.substring(0, 1).toUpperCase() + platform.substring(1) + " notification: \"" + notification + "\"");
            }
        }
        showNotifications(allNotifications);
        return allNotifications;
    }

    public void showNotifications(List<String> notifications){
        for(String not: notifications){
            System.out.println(not);
        }
    }

    public void markAsRead(String platform, int notificationId) {
        SocialMediaAdapter adapter = adapters.get(platform.toLowerCase());
        if (adapter != null) {
            adapter.markNotificationAsRead(notificationId);
        } else {
            System.out.println("Platform not supported: " + platform);
        }
    }

    public void deleteNotification(String platform, int notificationId) {
        SocialMediaAdapter adapter = adapters.get(platform.toLowerCase());
        if (adapter != null) {
            adapter.deleteNotification(notificationId);
        } else {
            System.out.println("Platform not supported: " + platform);
        }
    }
}
