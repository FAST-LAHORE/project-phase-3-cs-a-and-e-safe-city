/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safecity;

/**
 *
 * @author DELL
 */
public class trackinglist {
    
    
    int id;
    int key;
    boolean status;

    public int getId() {
        return id;
    }

    public int getkey() {
        return key;
    }

    public boolean getStatus() {
        return status;
    }

    public trackinglist() {
    }

    public trackinglist(int id, int key, boolean status) {
        this.id = id;
        this.key = key;
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.id;
        hash = 73 * hash + this.key;
        hash = 73 * hash + (this.status ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final trackinglist other = (trackinglist) obj;
        return true;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setkey(int key) {
        this.key = key;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
