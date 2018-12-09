/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

/**
 *
 * @author wmall
 */
public class PhoneValidation {
    
     public static boolean validate(String phoneStr){
        
        String regex = "\\d+";
         
        return phoneStr.matches(regex) && phoneStr.length() > 7 && phoneStr.length() < 15;
    
    }
    
}
