/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author wmall
 */
public class driver {
    
    public static void main(String [] args){
     EntityManager em= EntityManagerClass.getManager();
    em.getTransaction().begin();
        Vehicle a = new Vehicle();
        a.setCnic("1231232423223");
        a.setVehicletype("asdas");
        a.setRegistrationnumber("asdasd");
        a.setId(1);
        em.persist(a);
    em.getTransaction().commit();
    
    em.close();
    //emf.close();
    }
    
}
