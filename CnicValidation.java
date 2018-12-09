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
public class CnicValidation {
    
    public static boolean validate(String cnicStr){
        
        String regex = "\\d+";
         
        return cnicStr.matches(regex) && cnicStr.length() == 13;
    
    }
}
