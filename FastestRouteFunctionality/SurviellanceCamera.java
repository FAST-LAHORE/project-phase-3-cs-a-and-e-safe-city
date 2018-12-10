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
public class SurviellanceCamera {
     private int camera_number;
    private String status;
    private String path;
    
    // THIS METHOD TAKES FILE LOCATION (WHICH IS BASICALLY CAMERA FEED)
    SurviellanceCamera(String file_loc){
        this.path = file_loc;
    }
    
    public void getCameraFeed(){
        // IN THIS METHOD, VIDEO WILL BE DISPLAYED ON THE BASIS OF PATH SAVED IN ANY CAMERA
    }
    public void snapFrame(){
        // THIS IS UTILITY FUNCTION TO MAKE SNAP OF CAMERA FEED AT ANY INSTANT
    }
    
    public String getStatus(){
        return this.status;
    }
    
    
    static int estimateTime(Route r)
    {
       int distance = r.getDistane();
       int trafficExtent=CameraFeed.getTrafficExtent(r);
       
       return distance * trafficExtent;
       
    }
    public String getFile(){
        return this.path;
    }
}
