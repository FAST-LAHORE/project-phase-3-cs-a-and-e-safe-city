/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

/**
 *
 * @author Bilal
 */
import java.util.ArrayList;

public class Route {
    
    ArrayList<SurviellanceCamera> cameras_List;
    String routeStart;
    String routeEnd;
    int distance;
    
    Route(String routeStart, String routeEnd){
        cameras_List = new ArrayList<SurviellanceCamera>();
        this.routeStart = routeStart;
        this.routeEnd = routeEnd;
    }
    
    public void addCamera(SurviellanceCamera camera){
        cameras_List.add(camera);
    }
    
    public SurviellanceCamera getCamera(String file_Loc){
        for(int i = 0; i < cameras_List.size(); i++){
            if(cameras_List.get(i).getFile().equals(file_Loc)){
                return cameras_List.get(i);
            }
        }
        return null;
    }
    
    int getDistane()
    {
        return distance;
    }
}
