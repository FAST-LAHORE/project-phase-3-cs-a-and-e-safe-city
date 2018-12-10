/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
/**
 *
 * @author Bilal
 */
public class Map {
    
  static ArrayList<Route> allRoutes=new  ArrayList<>();
   
  static ArrayList<Route> getRoutes()
   {
      return allRoutes;
          
   }
   
   Route getFastestRoute(String source , String Destination)
   {
       Route route=null;
       int shortestTime =0;
       ArrayList<Route> Routes =filterRoutes(source,Destination);
       for(int i =0;i< Routes.size();i++)
       {
            int time =SurviellanceCamera.estimateTime(Routes.get(i));
           if(shortestTime>time){
               shortestTime=time;
               route=Routes.get(i);
           }
          
       }
       return route;
   }
    
   
   ArrayList<Route>  filterRoutes(String source , String Destination)
   {
       ArrayList<Route> currentRoutes=new ArrayList<Route>();
       for(int i =0;i< allRoutes.size();i++)
       {
           if(allRoutes.get(i).routeStart.equals(source) && allRoutes.get(i).routeEnd.equals(Destination))
               currentRoutes.add(allRoutes.get(i));
       }
       return currentRoutes;
   }
}
