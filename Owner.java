/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author wmall
 */

@Entity
@DiscriminatorValue("owner")
public class Owner extends Person{
    
    
    
    
}
