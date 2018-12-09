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
public class InputValidation {
    
    
    public static String loginValidate(String email,String password){
    
            if(email.equals("")){
            
                return "Please write your EMAIL";
               
            }else if(password.equals("")){
            
                return "Please write your password";
                
            }
    
            return "1";
    }
    
    
    public static String bookValidate(String isbn,String title,String author,String subject){
    
    
        if(isbn.equals("")){
             return "Please ISBN of the Book";
        
        }else if(title.equals("")){
             return "Please Title of the Book";
        
        }else if(author.equals("")){
             return "Please Author of the Book";
        
        }else if(subject.equals("")){
             return "Please Subject of the Book";
        
        }
        
        return "1";
        
    }
    
    public static String validate(String name,String gender,String cnic,String phone,String address,String city,String email,String password){
    
        if(name.equals("")){
                return "Please write your Name";
                
            
            }else if(cnic.equals("")){
            
               return "Please write your CNIC";
                
            }else if(email.equals("")){
            
                return "Please write your EMAIL";
               
            }else if(address.equals("")){
            
                return "Please write your Address";
               
            }else if(gender.equals("")){
            
                return "Please select your gender";
               
            }else if(phone.equals("")){
            
                return "Please write your phone number";
               
            }else if(password.equals("")){
            
                return "Please write your password";
                
            }else if(city.equals("")){
            
                return "Please write your city";
                
            }
             
        return "1";
    }

   
    
}
