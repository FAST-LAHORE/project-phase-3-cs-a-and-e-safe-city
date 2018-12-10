/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;
import java.util.ArrayList;
/**
 *
 * @author Bilal
 */
public class CameraFeed {
    
   static  ArrayList<Integer> trafficExtent=new ArrayList<>();
    
    
    
    static int getTrafficExtent(Route route)
    {
        return trafficExtent.get(Map.getRoutes().indexOf(route)).intValue();
    }
    
}
