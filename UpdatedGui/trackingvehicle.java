/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safecity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class trackingvehicle {
    
    ArrayList  <trackinglist> list=new ArrayList();
    
    static trackingvehicle v;
    
    private trackingvehicle() throws SQLException
    {
            loadtrackinglist();
        
        
        
     
    }
    
    
    
   trackingvehicle getinstance() throws SQLException
    {
        
        if(v==null)
        {
           v=new trackingvehicle(); 
        }
      return v;  
    }

    public void loadtrackinglist() throws SQLException {
        
        
        
        
          Connection myconobj;
    Statement mystatobj;
   ResultSet myresobj;
      ResultSet myresobj1;
   
    
    
    
         myconobj = DriverManager.getConnection("jdbc:derby://localhost:1527/SafeCityDB");
         mystatobj = myconobj.createStatement();
        myresobj =  mystatobj.executeQuery("Select * from trackingreg");
         while(myresobj.next())  {
                        trackinglist l=new trackinglist();
                        
                 l.setId(myresobj.getInt(1));
                 l.setkey(myresobj.getInt(2));
                l.setStatus(myresobj.getBoolean(3));
             
               list.add(l);
                
         }
  
    }
    
}
