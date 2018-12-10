package Classes;

import java.util.ArrayList;

public class Route {
    
    ArrayList<SurveillanceCamera> cameras_List;
    String routeStart;
    String routeEnd;
    
    Route(String routeStart, String routeEnd){
        cameras_List = new ArrayList<SurveillanceCamera>();
        this.routeStart = routeStart;
        this.routeEnd = routeEnd;
    }
    
    public void addCamera(SurveillanceCamera camera){
        cameras_List.add(camera);
    }
    
    public SurveillanceCamera getCamera(String file_Loc){
        for(int i = 0; i < cameras_List.size(); i++){
            if(cameras_List.get(i).getFile().equals(file_Loc)){
                return cameras_List.get(i);
            }
        }
        return null;
    }
}
