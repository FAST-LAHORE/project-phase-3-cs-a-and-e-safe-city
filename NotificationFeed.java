/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Transient;

// sigolton class

/**
 *
 * @author Bilal
 */
public class NotificationFeed {
    
    //@Transient
    //public  EntityManagerFactory emf = Persistence.createEntityManagerFactory("SafeCityModalPU");
        
   //@Transient
    //public EntityManager em = emf.createEntityManager();
    
    private List<Notification> allNotifications=new ArrayList();
    private List<Feedback> allFeedbacks=new ArrayList();
    
    //instance
    private static NotificationFeed instance ;
    
    //constructor
    private NotificationFeed()
    {
        loadNotifications();
        loadFeedback();
        
    }
    
    
    // get
    
    public static NotificationFeed getNotificationFeed()
    {
        if(instance==null)
               instance=new NotificationFeed();
        return instance;
    }
    
    
    
    public List<Notification> getNotifications()
    {
        return allNotifications;
    }
    
     public List<Feedback> getFeedback()
    {
        return allFeedbacks;
    }
    
    public void loadNotifications()
    {
        
     // EntityManagerFactory emf = Persistence.createEntityManagerFactory("SafeCityModalPU");
        
   
     // EntityManager em = emf.createEntityManager();
        
       EntityManager em=EntityManagerClass.getManager();
        
       allNotifications=(List<Notification>) em.createNamedQuery("Notification.findAll").getResultList();
        
    }
    
    public void loadFeedback()
    {
        
     // EntityManagerFactory emf = Persistence.createEntityManagerFactory("SafeCityModalPU");
        
   
     // EntityManager em = emf.createEntityManager();
        
       EntityManager em=EntityManagerClass.getManager();
        
       allFeedbacks=(List<Feedback>) em.createNamedQuery("Feedback.findAll").getResultList();
        
    }
    
    public boolean addNotification(Notification notificationObj)
    {
        try{
           // EntityManagerFactory emf = Persistence.createEntityManagerFactory("SafeCityModalPU");
        
   
        //   EntityManager em = emf.createEntityManager();
            EntityManager em=EntityManagerClass.getManager();
            em.getTransaction().begin();        
            allNotifications.add(notificationObj);          
                   
            em.persist(notificationObj);  
            em.getTransaction().commit();
            //em.close();
            //emf.close();
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        
    }
        public boolean updateNotification(Integer id,Integer status)
        {
        try{
            //EntityManagerFactory emf = Persistence.createEntityManagerFactory("SafeCityModalPU");
        
            EntityManager em=EntityManagerClass.getManager();
   
         //   EntityManager em = emf.createEntityManager();
            for(int i=0;i<allNotifications.size();i++)
            {
               if(allNotifications.get(i).getId().equals(id))
               {
                   allNotifications.get(i).setStatus(status);
               }
            }
            
             em.getTransaction().begin(); 
        
            em.createNamedQuery("Notification.updateById").setParameter("status", status).setParameter("id", id).executeUpdate();
             em.getTransaction().commit(); 
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        }
    
        
    public boolean addFeedback(Feedback feedObj)
    {
        try{
           // EntityManagerFactory emf = Persistence.createEntityManagerFactory("SafeCityModalPU");
        
   
        //   EntityManager em = emf.createEntityManager();
            EntityManager em=EntityManagerClass.getManager();
            em.getTransaction().begin();        
            allFeedbacks.add(feedObj);          
                   
            em.persist(feedObj);  
            em.getTransaction().commit();
            //em.close();
            //emf.close();
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        
    }
    
    
}
