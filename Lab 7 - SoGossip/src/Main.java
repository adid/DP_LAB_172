public class Main {
    public static void main(String[] args) {
        NotificationFacade notificationFacade = new NotificationFacade();

        notificationFacade.addNotification("facebook", 1, "New friend request");
        notificationFacade.addNotification("facebook", 2, "Event invitation");
        notificationFacade.addNotification("twitter", 1, "New follower");
        notificationFacade.addNotification("twitter", 2, "Mentioned in a tweet");

        System.out.println('\n');

        notificationFacade.fetchAllNotifications();

        System.out.println('\n');

        notificationFacade.markAsRead("facebook", 1);
        notificationFacade.deleteNotification("twitter", 1);

        System.out.println('\n');

        notificationFacade.fetchAllNotifications();
    }
}
