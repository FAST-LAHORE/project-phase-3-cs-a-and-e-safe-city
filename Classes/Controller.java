package safecity.Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import safecity.API.SendMail;

// Controller is based on Singleton Design Pattern
public class Controller {
    
    private static final Controller controller = new Controller();
    private static Connection DBConnection;
    private static Statement DBStatement;
    
    private Controller(){
        try{
            // ENTER DATABASE URL HERE
            DBConnection = DriverManager.getConnection("DATABASE URL HERE");
            DBStatement = DBConnection.createStatement();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static Controller getInstance(){
        return controller;
    }
    
    public void sendChallan(Challan challan, Person person){
        
        // SAVING CHALLAN IN DATABASE BEFORE MAILING
        saveChallan(challan);
        
        // PLEASE ENTER GMAIL DETAILS HERE BEFORE SENDING MAIL
        String user = "GMAIL ADDRESS";
        String pass = "PASSWORD";
        
        // SENDING CHALLAN TO VEHICLE OWNER
        String message = "You've been charged with " + challan.getChallanAmount()
                         + "against " + challan.getRegistrationNumber() + " (Registration Number)"
                         + "for :\n" + challan.getChallanReason() + "\n"
                         + "Challan is issued on " + challan.getIssueDate() + " and due on "
                         + challan.getDueDate() + ". Pay it asap.";
        SendMail.send(person.getEmail(), "CHALLAN againt " + challan.getRegistrationNumber(), message, user, pass);
    }
    
    public void saveChallan(Challan challan){
        String query = "Insert into Challans values ( " + challan.getChallanAmount() + ", '" + challan.getChallanReason() +
                                                      "', '" + challan.getIssueDate() + "', '" + challan.getDueDate() + 
                                                      "', '" + challan.getRegistrationNumber() + "')";
        
        try{
            DBStatement.executeUpdate(query);
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public Person vehicleRegistrationLookup(String registrationNumber){
        String CNICQuery = "Select OwnerCNIC from Vehicles where RegistrationNumber = '" + registrationNumber + "'";
        try{
            // LOOKING CNIC LINKED WITH REGISTRATION NUMBER
            ResultSet result = DBStatement.executeQuery(CNICQuery);
            if(!result.next()){
                // LOOKING PERSON WITH ABOVE CNIC
                String ownerCNIC = result.getString("OwnerCNIC");
                result = DBStatement.executeQuery("Select * from Persons where CNIC = '" + ownerCNIC + "'");
                if(!result.next()){
                    String name = result.getString("Name");
                    String email = result.getString("Email");
                    String phoneNumber = result.getString("PhoneNumber");
                    return new Person(name, ownerCNIC, email, phoneNumber);
                }
                else{
                    return null;
                }
            }
            else{
                return null;
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
