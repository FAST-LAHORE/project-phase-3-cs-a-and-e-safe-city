package Classes;

import API.SendMail;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Transient;

// CONTROLLER class is based on Singleton Design Pattern

public class Controller {
    @Transient
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("SafeCityModalPU");
    @Transient
    private static final EntityManager em = (EntityManager) emf.createEntityManager();
    
    private Controller(){}
    
    public static EntityManager getManager(){
        return em;
    }
    
    // THIS METHOD RETURNS THE OWNER REGISTERED TO ANY VEHICLE IF ANY
    public static Person vehicleRegistrationLookup(String registrationNumber){
        try{
            Vehicle v = (Vehicle) em.createNamedQuery("Vehicle.findByRegistrationnumber")
                        .setParameter("registrationnumber", registrationNumber)
                        .getSingleResult();
            
            Person p = (Person) em.createNamedQuery("Person.findByCnic")
                        .setParameter("cnic", v.getCnic())
                        .getSingleResult();
            return p;
        }
        catch(Exception e){
            throw e;
        }
    }
    
    // THIS METOHD SAVES CHALLAN IN THE DATABASE
    private static void saveChallan(Challan challan){
        try {
            em.getTransaction().begin();
            em.persist(challan);
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw e;
        }
    }
    
    // THIS METHOD SAVES AND MAILS CHALLAN
    public static boolean sendChallan(Challan challan, Person person) {
        try {
            
            saveChallan(challan);
            
            // PLEASE ENTER GMAIL DETAILS HERE BEFORE SENDING MAIL
            String user = "GMAIL ADDRESS";
            String pass = "PASSWORD";

            // SENDING CHALLAN TO VEHICLE OWNER
            String message = "You've been charged with " + challan.getAmount()
                    + "against " + challan.getRegistrationnumber() + " (Registration Number)"
                    + "for :\n" + challan.getReason() + "\n"
                    + "Challan is issued on " + challan.getIssuedate() + " and due on "
                    + challan.getDuedate() + ". Pay it asap.";
            SendMail.send(person.getEmail(), "CHALLAN againt " + challan.getRegistrationnumber(), message, user, pass);
            return true;
        }
        catch(Exception e){
            throw e;
        }
    }
}
