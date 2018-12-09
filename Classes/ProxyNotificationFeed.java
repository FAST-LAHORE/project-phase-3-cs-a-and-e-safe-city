package Classes;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

public class ProxyNotificationFeed implements NotificationFeed{
    
    // FOR GLOBAL USAGE
    private static final ProxyNotificationFeed proxyNotificationFeed = new ProxyNotificationFeed();
    
    // FOR REDUCING MEMORY FOORPRINT OF REAL OBJECT IMAGE
    private RealNotificationFeed realNotificationFeed;
    
    private List<Notification> allNotifications;
    private final EntityManager em;
    
    private ProxyNotificationFeed(){
        em = Controller.getManager();
    }
    
    public static ProxyNotificationFeed getInstance(){
        return proxyNotificationFeed;
    }
    
    // NOTIFICATION FEED MUST BE SET BEFORE USAGE
    @Override
    public void setNotifications() {
        if(realNotificationFeed == null){
            realNotificationFeed = new RealNotificationFeed();
            allNotifications = realNotificationFeed.getNotifications();
        }
    }
    
    @Override
    public List<Notification> getNotifications() {
        return allNotifications;
    }

    // THIS METHOD RETURNS FILTERED NOTIFICATIONS FOR RESCUE DEPARTMENT
    @Override
    public ArrayList<Notification> getRescueFilteredNotifications() {
        return realNotificationFeed.getRescueFilteredNotifications();
    }

    @Override
    public boolean addNotification(Notification notificationObj) {
        return realNotificationFeed.addNotification(notificationObj);
    }

    @Override
    public boolean updateNotification(Integer id, Integer status) {
        return realNotificationFeed.updateNotification(id, status);
    }
}