package Classes;

import java.util.ArrayList;
import java.util.List;

public interface NotificationFeed{
    
    // THIS METHOD SETS MEMBER ARRAYLIST TO LOADED DATA
    void setNotifications();
    
    public ArrayList<Notification> getRescueFilteredNotifications();
    public boolean addNotification(Notification notificationObj);
    public boolean updateNotification(Integer id, Integer status);
    public List<Notification> getNotifications();
}
