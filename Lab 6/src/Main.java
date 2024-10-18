import Adapter.EPostalAdapter;
import NotificationService.EPostalNotification;
import NotificationService.EmailNotification;
import NotificationService.SMSNotification;

public class Main {
    public static void main(String[] args) {

        EmailNotification email = new EmailNotification();
        SMSNotification sms = new SMSNotification();
        EPostalNotification postalMail = new EPostalNotification();

        String receiver = "Adid";
        String message = "Mid Term Coming!!";
        String address = "Mirpur, Dhaka";
        EPostalAdapter adapter = new EPostalAdapter(postalMail,address);

        email.sendNotification(receiver,message);
        sms.sendNotification(receiver,message);
        adapter.sendNotification(receiver,message);
    }
}