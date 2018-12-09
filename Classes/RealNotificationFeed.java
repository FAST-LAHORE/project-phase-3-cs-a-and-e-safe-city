package Classes;

import java.util.*;
import javax.persistence.EntityManager;

// NOTIFICATION_FEED class is based on PROXY DESIGN PATTERN
public final class RealNotificationFeed implements NotificationFeed{

    private List<Notification> allNotifications;
    private final EntityManager em;

    public RealNotificationFeed() {
        em = Controller.getManager();
        loadNotifications();
    }

    // THIS METHOD LOADS ALL THE NOTIFICATIONS
    private void loadNotifications() {
        try {
            allNotifications = (List<Notification>) em.createNamedQuery("Notification.findAll").getResultList();
        } catch (Exception e) {
            throw e;
        }
    }
    
    // AS ALREADY SET BY LOAD NOTIFICATIONS METHOD
    @Override
    public void setNotifications() {}
    
    @Override
    public List<Notification> getNotifications() {
        return allNotifications;
    }
    
    // THIS METHOD RETURNS FILTERED NOTIFICATIONS FOR RESCUE DEPARTMENT
    @Override
    public ArrayList<Notification> getRescueFilteredNotifications() {
        try {
            ArrayList<Notification> filteredNotifications = new ArrayList();

            // CHECKING FROM ALREADY LOADED NOTIFICATIONS
            for (int i = 0; i < allNotifications.size(); i++) {
                Notification currentNotification = allNotifications.get(i);
                Category currentCategory = currentNotification.getCategory();
                if(currentCategory.equals(Category.Ambulance)
                   || currentCategory.equals(Category.FireBrigade)
                   || currentCategory.equals(Category.Murder)
                   || currentCategory.equals(Category.Suicide))
                {
                    filteredNotifications.add(currentNotification);
                }
            }
            return filteredNotifications;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean addNotification(Notification notificationObj) {
        try {
            // ADDING LOCALLY
            allNotifications.add(notificationObj);

            // ADDING IN THE DATABASES
            em.getTransaction().begin();
            em.persist(notificationObj);
            em.getTransaction().commit();
            return true;
        } 
        catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean updateNotification(Integer id, Integer status) {
        try {
            // UPDATING LOCALLY
            for (int i = 0; i < allNotifications.size(); i++) {
                if (allNotifications.get(i).getId().equals(id)) {
                    allNotifications.get(i).setStatus(status);
                }
            }
            // UPDATING IN THE DATABASES
            em.getTransaction().begin();
            em.createNamedQuery("Notification.updateById").setParameter("status", status).setParameter("id", id).executeUpdate();
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            throw e;
        }
    }
}