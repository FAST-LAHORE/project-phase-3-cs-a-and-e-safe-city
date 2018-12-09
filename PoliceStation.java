/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import java.util.List;
/**
 *
 * @author wmall
 */

@Entity
@DiscriminatorValue("police")
public class PoliceStation extends Organization{
    
    
     static  private PoliceStation instance=new PoliceStation();
    
    
     static public PoliceStation getInstance()
     {
         return instance;
     }
    
    public String   login(String email)
    {
        try{
            //@NamedQuery(name = "Person.findByEmail", query = "SELECT p FROM Person p WHERE p.email = :email"),
            
            //allNotifications=(List<Notification>) em.createNamedQuery("Notification.findAll").getResultList();
            
            EntityManager em=EntityManagerClass.getManager();
            List<PoliceStation> station= (List<PoliceStation>) em.createNamedQuery("Organization.findByEmail").setParameter("email", email).getResultList();
            
            if(!station.isEmpty())
                return station.get(0).getPassword();
            
            return "no";
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            return "no";
        }
    }

}
