/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

/* *
 * @author Bilal
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Transient;

public class EntityManagerClass {
    
    @Transient
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("SafeCityModalPU");
    @Transient
    private static  EntityManager em = emf.createEntityManager();
    
    
    public static EntityManager getManager()
    {
        return em;
    }
    
    
}
