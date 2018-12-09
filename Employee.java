/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


import java.util.List;
import javax.persistence.EntityManager;


/**
 *
 * @author wmall
 */

@Entity
@DiscriminatorValue("employee")
public class Employee extends Person{
    
    //@Transient
    //EntityManagerFactory emf = Persistence.createEntityManagerFactory("SafeCityModalPU");
    //@Transient
    //EntityManager em = emf.createEntityManager();
   
    @Column(name = "PASSWORD")
    private String password;    static  private Employee instance=new Employee();
    
    
     static public Employee getInstance()
     {
         return instance;
     }
    
    public void setPassword(String password)
    {
        this.password=password;
    }
    
    
    public  String  getPassword()
    {
        return password;
    }
    
    public boolean   addEmployee(Employee emp)
    {
        try{
            //@NamedQuery(name = "Person.findByEmail", query = "SELECT p FROM Person p WHERE p.email = :email"),
            
           // allNotifications=(List<Notification>) em.createNamedQuery("Notification.findAll").getResultList();
            EntityManager em=EntityManagerClass.getManager();
            List<Employee> allEmployees= (List<Employee>) em.createNamedQuery("Person.findByEmail").setParameter("email", emp.getEmail()).getResultList();
            
            if(!allEmployees.isEmpty())
                return false;
            
            
            em.getTransaction().begin();                         
            em.persist(emp);  
            em.getTransaction().commit();
            
            
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        
    }
    
    public boolean   addOrganization(Organization org)
    {
        try{
            //@NamedQuery(name = "Person.findByEmail", query = "SELECT p FROM Person p WHERE p.email = :email"),
            
            //allNotifications=(List<Notification>) em.createNamedQuery("Notification.findAll").getResultList();
            EntityManager em=EntityManagerClass.getManager();
            //List<Organization> allOrganizations= (List<Organization>) em.createNamedQuery("Organization.findByOrganizationtypeAndEmail").setParameter("organizationtype", org.getOrganizationtype()).setParameter("email", org.getEmail()).getResultList();
            
            List<Organization> allOrganizations= (List<Organization>) em.createNamedQuery("Organization.findByEmail").setParameter("email", org.getEmail()).getResultList();
            if(allOrganizations.isEmpty())
            {
                
            
            
            em.getTransaction().begin();                         
            em.persist(org);  
            em.getTransaction().commit();
            return true;
            }
            else ///if(allOrganizations.size()>0)//allOrganizations.get(0).getOrganizationtype().equals(org.getOrganizationtype()))
            {
            
                for(int i=0;i<allOrganizations.size();i++)
                {
                if(allOrganizations.get(i).getOrganizationtype().equals(org.getOrganizationtype()))                
                    return false;
                }
                 
                 
                   em.getTransaction().begin();                                    
                   em.persist(org);              
                   em.getTransaction().commit();            
                   return true;
                
                
            }
           
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        
    }
    
    
    public String  login(String email)
    {
        try{
            
            
               EntityManager em=EntityManagerClass.getManager();
            
            List<Employee> employee= (List<Employee>)em.createNamedQuery("Person.findByEmail").setParameter("email", email).getResultList();
            
            if(!employee.isEmpty())
                return employee.get(0).getPassword();
            
            return "no";
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            return "no";
        }
    }

}
