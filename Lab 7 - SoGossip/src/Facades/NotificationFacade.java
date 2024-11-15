package Facades;

import Behaviours.ISocialMedia;
import Concretes.Facebook;
import Concretes.Twitter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationFacade {
    private Map<String, ISocialMedia> socials;

    public NotificationFacade() {
        socials = new HashMap<>();
        socials.put("twitter", new Twitter());
        socials.put("facebook", new Facebook());
    }

    public void addNotification(String platform, int notificationId, String message) {
        ISocialMedia adapter = socials.get(platform.toLowerCase());
        if (adapter != null) {
            adapter.addNotification(notificationId, message);
        } else {
            System.out.println("Platform not supported: " + platform);
        }
    }

    public List<String> fetchAllNotifications() {
        List<String> allNotifications = new ArrayList<>();

        for (Map.Entry<String, ISocialMedia> entry : socials.entrySet()) {
            String platform = entry.getKey();
            ISocialMedia adapter = entry.getValue();

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
        ISocialMedia adapter = socials.get(platform.toLowerCase());
        if (adapter != null) {
            adapter.markNotificationAsRead(notificationId);
        } else {
            System.out.println("Platform not supported: " + platform);
        }
    }

    public void deleteNotification(String platform, int notificationId) {
        ISocialMedia adapter = socials.get(platform.toLowerCase());
        if (adapter != null) {
            adapter.deleteNotification(notificationId);
        } else {
            System.out.println("Platform not supported: " + platform);
        }
    }
}
