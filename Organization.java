/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author wmall
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "OrganizationType")
@Table(name = "ORGANIZATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Organization.findAll", query = "SELECT o FROM Organization o"),
    @NamedQuery(name = "Organization.findById", query = "SELECT o FROM Organization o WHERE o.id = :id"),
    @NamedQuery(name = "Organization.findByEmail", query = "SELECT o FROM Organization o WHERE o.email = :email"),
    @NamedQuery(name = "Organization.findByLocation", query = "SELECT o FROM Organization o WHERE o.location = :location"),
    
    @NamedQuery(name = "Organization.findByOrganizationtypeAndEmail", query = "SELECT o FROM Organization o WHERE o.organizationtype = :organizationtype AND o.email = :email"),
    
    @NamedQuery(name = "Organization.findByOrganizationtype", query = "SELECT o FROM Organization o WHERE o.organizationtype = :organizationtype")})
public abstract class Organization implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "LOCATION")
    private String location;
    @Basic(optional = false)
    @Column(name = "ORGANIZATIONTYPE")
    private String organizationtype;

    
    @Basic(optional = false)
    @Column(name = "CITY")
    private String city;
    
    @Basic(optional = false)
    @Column(name = "PHONENUMBER")
    private String phonenumber;
    
    @Column(name = "PASSWORD")
    private String password;
    
    public Organization() {
    }

    public Organization(Integer id) {
        this.id = id;
    }

    public Organization(Integer id, String email, String location, String organizationtype) {
        this.id = id;
        this.email = email;
        this.location = location;
        this.organizationtype = organizationtype;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
     public void setPassword(String password)
    {
        this.password=password;
    }
    
    
    public  String  getPassword()
    {
        return password;
    }
    
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOrganizationtype() {
        return organizationtype;
    }

    public void setOrganizationtype(String organizationtype) {
        this.organizationtype = organizationtype;
    }

    
    // @Transient
   // EntityManagerFactory emf = Persistence.createEntityManagerFactory("SafeCityModalPU");
    //@Transient
    //EntityManager em = emf.createEntityManager();
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Organization)) {
            return false;
        }
        Organization other = (Organization) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modal.Organization[ id=" + id + " ]";
    }
    
}
