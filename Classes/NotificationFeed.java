package Classes;

import java.util.*;
import javax.persistence.EntityManager;

// NOTIFICATION FEED class is based on Singleton Design Pattern
public final class NotificationFeed {

    private static NotificationFeed instance;

    private static List<Notification> allNotifications;

    private static EntityManager em;

    private NotificationFeed() {
        em = Controller.getManager();
        loadNotifications();
    }

    public static NotificationFeed getNotificationFeed() {
        if (instance == null) {
            instance = new NotificationFeed();
        }
        return instance;
    }

    // THIS METHOD LOADS ALL THE NOTIFICATIONS
    private void loadNotifications() {
        try {
            allNotifications = (List<Notification>) em.createNamedQuery("Notification.findAll").getResultList();
        } catch (Exception e) {
            throw e;
        }
    }

    // THIS METHOD GETS ALL THE NOTIFICATIONS
    public List<Notification> getNotifications() {
        return allNotifications;
    }

    // THIS METHOD RETURNS FILTERED NOTIFICATIONS FOR RESCUE DEPARTMENT
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
