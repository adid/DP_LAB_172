package Adapter;

import Interface.INotify;
import NotificationService.EPostalNotification;

public class EPostalAdapter implements INotify {

    protected EPostalNotification ePostalNotification;
    protected String address;

    public EPostalAdapter(EPostalNotification ePostalNotification, String address){
        this.ePostalNotification = ePostalNotification;
        this.address = address;
    }

    @Override
    public void sendNotification(String receiver, String message) {
        ePostalNotification.sendNotification(receiver,message,address);
    }
}
