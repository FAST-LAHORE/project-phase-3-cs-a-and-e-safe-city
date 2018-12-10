package Classes;

public class SurveillanceCamera {
    private int camera_number;
    private CameraStatus status;
    private String path;
    
    // THIS METHOD TAKES FILE LOCATION (WHICH IS BASICALLY CAMERA FEED)
    SurveillanceCamera(String file_loc){
        this.path = file_loc;
    }
    
    public void getCameraFeed(){
        // IN THIS METHOD, VIDEO WILL BE DISPLAYED ON THE BASIS OF PATH SAVED IN ANY CAMERA
    }
    public void snapFrame(){
        // THIS IS UTILITY FUNCTION TO MAKE SNAP OF CAMERA FEED AT ANY INSTANT
    }
    
    public CameraStatus getStatus(){
        return this.status;
    }
    
    public String getFile(){
        return this.path;
    }
}
